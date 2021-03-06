package com.tencent.mm.plugin.card.sharecard.model;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.tencent.mm.e.b.bv;
import com.tencent.mm.plugin.card.a.d;
import com.tencent.mm.plugin.card.b.i;
import com.tencent.mm.plugin.card.model.ab;
import com.tencent.mm.protocal.b.apo;
import com.tencent.mm.protocal.b.gx;
import com.tencent.mm.protocal.b.gz;
import com.tencent.mm.protocal.b.ha;
import com.tencent.mm.protocal.b.hf;
import com.tencent.mm.sdk.h.c.a;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.v;
import java.lang.reflect.Field;
import java.util.Map;

public class ShareCardInfo
  extends bv
  implements Parcelable, com.tencent.mm.plugin.card.base.b
{
  public static final Parcelable.Creator<ShareCardInfo> CREATOR = new Parcelable.Creator() {};
  protected static c.a bjR;
  public ha cMA;
  public boolean cMB = true;
  public hf cMx;
  public gx cMy;
  public apo cMz;
  
  static
  {
    c.a locala = new c.a();
    bZI = new Field[19];
    aZx = new String[20];
    StringBuilder localStringBuilder = new StringBuilder();
    aZx[0] = "card_id";
    kyU.put("card_id", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" card_id TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    kyT = "card_id";
    aZx[1] = "card_tp_id";
    kyU.put("card_tp_id", "TEXT");
    localStringBuilder.append(" card_tp_id TEXT");
    localStringBuilder.append(", ");
    aZx[2] = "from_username";
    kyU.put("from_username", "TEXT");
    localStringBuilder.append(" from_username TEXT");
    localStringBuilder.append(", ");
    aZx[3] = "consumer";
    kyU.put("consumer", "TEXT");
    localStringBuilder.append(" consumer TEXT");
    localStringBuilder.append(", ");
    aZx[4] = "app_id";
    kyU.put("app_id", "TEXT");
    localStringBuilder.append(" app_id TEXT");
    localStringBuilder.append(", ");
    aZx[5] = "status";
    kyU.put("status", "INTEGER");
    localStringBuilder.append(" status INTEGER");
    localStringBuilder.append(", ");
    aZx[6] = "share_time";
    kyU.put("share_time", "LONG");
    localStringBuilder.append(" share_time LONG");
    localStringBuilder.append(", ");
    aZx[7] = "local_updateTime";
    kyU.put("local_updateTime", "LONG");
    localStringBuilder.append(" local_updateTime LONG");
    localStringBuilder.append(", ");
    aZx[8] = "updateTime";
    kyU.put("updateTime", "LONG");
    localStringBuilder.append(" updateTime LONG");
    localStringBuilder.append(", ");
    aZx[9] = "begin_time";
    kyU.put("begin_time", "LONG");
    localStringBuilder.append(" begin_time LONG");
    localStringBuilder.append(", ");
    aZx[10] = "end_time";
    kyU.put("end_time", "LONG");
    localStringBuilder.append(" end_time LONG");
    localStringBuilder.append(", ");
    aZx[11] = "updateSeq";
    kyU.put("updateSeq", "LONG");
    localStringBuilder.append(" updateSeq LONG");
    localStringBuilder.append(", ");
    aZx[12] = "block_mask";
    kyU.put("block_mask", "LONG");
    localStringBuilder.append(" block_mask LONG");
    localStringBuilder.append(", ");
    aZx[13] = "dataInfoData";
    kyU.put("dataInfoData", "BLOB");
    localStringBuilder.append(" dataInfoData BLOB");
    localStringBuilder.append(", ");
    aZx[14] = "cardTpInfoData";
    kyU.put("cardTpInfoData", "BLOB");
    localStringBuilder.append(" cardTpInfoData BLOB");
    localStringBuilder.append(", ");
    aZx[15] = "shareInfoData";
    kyU.put("shareInfoData", "BLOB");
    localStringBuilder.append(" shareInfoData BLOB");
    localStringBuilder.append(", ");
    aZx[16] = "shopInfoData";
    kyU.put("shopInfoData", "BLOB");
    localStringBuilder.append(" shopInfoData BLOB");
    localStringBuilder.append(", ");
    aZx[17] = "categoryType";
    kyU.put("categoryType", "INTEGER default '0' ");
    localStringBuilder.append(" categoryType INTEGER default '0' ");
    localStringBuilder.append(", ");
    aZx[18] = "itemIndex";
    kyU.put("itemIndex", "INTEGER default '0' ");
    localStringBuilder.append(" itemIndex INTEGER default '0' ");
    aZx[19] = "rowid";
    kyV = localStringBuilder.toString();
    bjR = locala;
  }
  
  public ShareCardInfo() {}
  
  public ShareCardInfo(Parcel paramParcel)
  {
    field_card_id = paramParcel.readString();
    field_card_tp_id = paramParcel.readString();
    field_from_username = paramParcel.readString();
    field_status = paramParcel.readInt();
    field_share_time = paramParcel.readLong();
    field_local_updateTime = paramParcel.readLong();
    field_updateTime = paramParcel.readLong();
    field_updateSeq = paramParcel.readLong();
    field_block_mask = paramParcel.readLong();
    field_end_time = paramParcel.readLong();
    field_categoryType = paramParcel.readInt();
    field_itemIndex = paramParcel.readInt();
    int k = paramParcel.readInt();
    int i;
    if (k > 0)
    {
      field_dataInfoData = new byte[k];
      i = 0;
      while (i < k)
      {
        field_dataInfoData[i] = paramParcel.readByte();
        i += 1;
      }
    }
    k = paramParcel.readInt();
    if (k > 0)
    {
      field_cardTpInfoData = new byte[k];
      i = 0;
      while (i < k)
      {
        field_cardTpInfoData[i] = paramParcel.readByte();
        i += 1;
      }
    }
    k = paramParcel.readInt();
    if (k > 0)
    {
      field_shareInfoData = new byte[k];
      i = 0;
      while (i < k)
      {
        field_shareInfoData[i] = paramParcel.readByte();
        i += 1;
      }
    }
    k = paramParcel.readInt();
    if (k > 0)
    {
      field_shopInfoData = new byte[k];
      i = j;
      while (i < k)
      {
        field_shopInfoData[i] = paramParcel.readByte();
        i += 1;
      }
    }
  }
  
  public final boolean MA()
  {
    return (MFjDc & 0x4) > 0L;
  }
  
  public final boolean MB()
  {
    return (MF() != null) && (MFjDo == 1);
  }
  
  public final boolean MC()
  {
    return (cMy != null) && (cMy.status == 0);
  }
  
  public final boolean MD()
  {
    if (!MC()) {}
    do
    {
      return false;
      if (cMx != null) {
        v.i("MicroMsg.ShareCardInfo", "is_acceptable:" + cMx.jDp);
      }
      v.i("MicroMsg.ShareCardInfo", "avail_num:" + cMy.jCt);
      if ((cMx != null) && (cMx.jDp == 1)) {
        return true;
      }
      if (cMy.jCt > 0) {
        return true;
      }
    } while (((cMx != null) && (cMx.jDp == 0)) || (cMy.jCt != 0));
    return false;
  }
  
  public final boolean ME()
  {
    if ((cMx == null) || (cMx.jDg == null) || (TextUtils.isEmpty(cMx.jDg.text))) {}
    gz localgz;
    int i;
    int j;
    do
    {
      return false;
      localgz = cMx.jDg;
      i = (int)(System.currentTimeMillis() / 1000L);
      j = gyI;
    } while ((gyI <= 0) || (j - i <= 0));
    return true;
  }
  
  public final hf MF()
  {
    if (cMx != null) {
      return cMx;
    }
    try
    {
      cMx = ((hf)new hf().au(field_cardTpInfoData));
      return cMx;
    }
    catch (Exception localException)
    {
      v.e("MicroMsg.ShareCardInfo", "getCardTpInfo fail, ex = %s", new Object[] { localException.getMessage() });
    }
    return new hf();
  }
  
  public final gx MG()
  {
    if (cMy != null) {
      return cMy;
    }
    try
    {
      cMy = ((gx)new gx().au(field_dataInfoData));
      return cMy;
    }
    catch (Exception localException)
    {
      v.e("MicroMsg.ShareCardInfo", "getDataInfo fail, ex = %s", new Object[] { localException.getMessage() });
    }
    return new gx();
  }
  
  public final apo MH()
  {
    if (cMz != null) {
      return cMz;
    }
    try
    {
      cMz = ((apo)new apo().au(field_shareInfoData));
      return cMz;
    }
    catch (Exception localException)
    {
      v.e("MicroMsg.ShareCardInfo", "getShareInfo fail, ex = %s", new Object[] { localException.getMessage() });
    }
    return new apo();
  }
  
  public final ha MI()
  {
    if (cMA != null) {
      return cMA;
    }
    try
    {
      cMA = ((ha)new ha().au(field_shopInfoData));
      return cMA;
    }
    catch (Exception localException)
    {
      v.e("MicroMsg.ShareCardInfo", "getShopInfo fail ex = %s", new Object[] { localException.getMessage() });
    }
    return null;
  }
  
  public final String MJ()
  {
    return field_card_id;
  }
  
  public final String MK()
  {
    return field_card_tp_id;
  }
  
  public final String ML()
  {
    return field_from_username;
  }
  
  public final long MM()
  {
    return field_local_updateTime;
  }
  
  public final String MN()
  {
    return "";
  }
  
  public final int MO()
  {
    return field_categoryType;
  }
  
  public final boolean Mo()
  {
    return (MF() != null) && (MFjDj == 0);
  }
  
  public final boolean Mp()
  {
    return (MF() != null) && (MFjDj == 1);
  }
  
  public final boolean Mq()
  {
    return (MF() != null) && (MFcMl == 10);
  }
  
  public final boolean Mr()
  {
    return (MF() != null) && (MFcMl == 0);
  }
  
  public final boolean Ms()
  {
    return (MF() != null) && (MFcMl == 20);
  }
  
  public final boolean Mt()
  {
    return (MF() != null) && (MFcMl == 11);
  }
  
  public final boolean Mu()
  {
    return (MF() != null) && (MFcMl == 30);
  }
  
  public final boolean Mv()
  {
    return i.gv(MFcMl);
  }
  
  public final boolean Mw()
  {
    return (MFjCZ & 0x2) == 0;
  }
  
  public final boolean Mx()
  {
    return (MFjCZ & 0x1) == 0;
  }
  
  public final boolean My()
  {
    return (MFjDc & 1L) == 0L;
  }
  
  public final boolean Mz()
  {
    return (MFjDc & 0x2) > 0L;
  }
  
  public final void a(gx paramgx)
  {
    cMy = paramgx;
    if (cMy != null) {}
    try
    {
      field_dataInfoData = paramgx.toByteArray();
      return;
    }
    catch (Exception paramgx)
    {
      v.e("MicroMsg.ShareCardInfo", "setDataInfo fail, ex = %s", new Object[] { paramgx.getMessage() });
    }
  }
  
  public final void a(ha paramha)
  {
    cMA = paramha;
    try
    {
      field_shopInfoData = paramha.toByteArray();
      return;
    }
    catch (Exception paramha)
    {
      v.e("MicroMsg.ShareCardInfo", "setShopInfo fail, ex = %s", new Object[] { paramha.getMessage() });
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public final String gb(int paramInt)
  {
    if (paramInt == 10) {
      return (String)ab.Nt().getValue("key_share_card_local_city");
    }
    if (paramInt == 0)
    {
      if (com.tencent.mm.plugin.card.sharecard.a.b.NG()) {
        return aa.getResources().getString(2131231534);
      }
      return "";
    }
    return "";
  }
  
  public final long getEndTime()
  {
    return field_end_time;
  }
  
  public final boolean isAcceptable()
  {
    if (!MC()) {}
    do
    {
      return false;
      if (cMx != null) {
        v.i("MicroMsg.ShareCardInfo", "is_acceptable:" + cMx.jDp);
      }
      v.i("MicroMsg.ShareCardInfo", "stock_num:" + cMy.jCw + " limit_num:" + cMy.jCx);
      if ((cMx != null) && (cMx.jDp == 1)) {
        return true;
      }
      if ((cMy.jCw > 0L) && (cMy.jCx > 0)) {
        return true;
      }
    } while (((cMx != null) && (cMx.jDp == 0)) || (cMy.jCw == 0L) || (cMy.jCx != 0));
    return false;
  }
  
  protected final c.a ou()
  {
    return bjR;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 0;
    paramParcel.writeString(field_card_id);
    paramParcel.writeString(field_card_tp_id);
    paramParcel.writeString(field_from_username);
    paramParcel.writeInt(field_status);
    paramParcel.writeLong(field_share_time);
    paramParcel.writeLong(field_local_updateTime);
    paramParcel.writeLong(field_updateTime);
    paramParcel.writeLong(field_updateSeq);
    paramParcel.writeLong(field_block_mask);
    paramParcel.writeLong(field_end_time);
    paramParcel.writeInt(field_categoryType);
    paramParcel.writeInt(field_itemIndex);
    if (field_dataInfoData != null)
    {
      paramParcel.writeInt(field_dataInfoData.length);
      paramInt = 0;
      while (paramInt < field_dataInfoData.length)
      {
        paramParcel.writeByte(field_dataInfoData[paramInt]);
        paramInt += 1;
      }
    }
    if (field_cardTpInfoData != null)
    {
      paramParcel.writeInt(field_cardTpInfoData.length);
      paramInt = 0;
      while (paramInt < field_cardTpInfoData.length)
      {
        paramParcel.writeByte(field_cardTpInfoData[paramInt]);
        paramInt += 1;
      }
    }
    if (field_shareInfoData != null)
    {
      paramParcel.writeInt(field_shareInfoData.length);
      paramInt = 0;
      while (paramInt < field_shareInfoData.length)
      {
        paramParcel.writeByte(field_shareInfoData[paramInt]);
        paramInt += 1;
      }
    }
    if (field_shopInfoData != null)
    {
      paramParcel.writeInt(field_shopInfoData.length);
      paramInt = i;
      while (paramInt < field_shopInfoData.length)
      {
        paramParcel.writeByte(field_shopInfoData[paramInt]);
        paramInt += 1;
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */