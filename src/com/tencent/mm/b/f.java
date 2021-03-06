package com.tencent.mm.b;

import com.tencent.mm.a.g;
import com.tencent.mm.sdk.platformtools.v;
import java.io.File;
import java.io.FileInputStream;
import java.io.RandomAccessFile;

public final class f
{
  public static int a(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    if ((paramString1 == null) || (paramString2 == null) || (paramString3 == null)) {
      return -1;
    }
    for (;;)
    {
      try
      {
        File localFile2 = new File(paramString1);
        RandomAccessFile localRandomAccessFile = new RandomAccessFile(localFile2, "r");
        File localFile1 = new File(paramString3);
        paramString2 = new File(paramString2);
        if ((!localFile2.exists()) || (!paramString2.exists()))
        {
          v.e("MicroMsg.MergePatchApk", "file not found in merge(): oldFile.exists()=" + localFile2.exists() + ", newFile.exists()=" + localFile1.exists() + ", patch.exists()=" + paramString2.exists());
          localRandomAccessFile.close();
          return -1;
        }
        paramString1 = a.aL(paramString1);
        if ((paramString1 != null) && (Xq != null))
        {
          i = Xq.Xt + 8;
          v.i("MicroMsg.MergePatchApk", "extLen = " + i);
          if (localRandomAccessFile.length() <= 0L)
          {
            i = 3;
            if (i != 1)
            {
              v.e("MicroMsg.MergePatchApk", "merge failed in patchLessMemory()");
              localRandomAccessFile.close();
              return -1;
            }
          }
          else
          {
            if (paramString2.length() <= 0L)
            {
              i = 2;
              continue;
            }
            paramString1 = new byte[(int)paramString2.length()];
            e.a(new FileInputStream(paramString2), paramString1, paramString1.length);
            i = d.a(localRandomAccessFile, (int)localRandomAccessFile.length(), paramString1, paramString1.length, localFile1, i);
            continue;
          }
          localRandomAccessFile.close();
          if (!paramString4.equalsIgnoreCase(g.aH(paramString3))) {
            return -2;
          }
          paramString1 = new b();
          paramString1.aN(paramString4);
          new a(paramString1).h(localFile1);
          return 0;
        }
      }
      catch (Exception paramString1)
      {
        v.e("MicroMsg.MergePatchApk", "Exception in merge()");
        return -1;
      }
      int i = 0;
    }
  }
}

/* Location:
 * Qualified Name:     com.tencent.mm.b.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */