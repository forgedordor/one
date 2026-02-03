package defpackage;

import android.os.Build;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class naq {
    public static boolean a(Throwable th) {
        return Build.VERSION.SDK_INT == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/NotProvisionedException;.<init>(");
    }

    public static boolean b(Throwable th) {
        return Build.VERSION.SDK_INT == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/ResourceBusyException;.<init>(");
    }

    public static byte[] c(mhl mhlVar, String str, byte[] bArr, Map map) throws nbb {
        Map map2;
        List list;
        mim mimVar = new mim(mhlVar);
        mhs mhsVar = new mhs();
        mhsVar.b(str);
        mhsVar.d = map;
        mhsVar.b = 2;
        mhsVar.c = bArr;
        mhsVar.f = 1;
        mht mhtVarA = mhsVar.a();
        int i = 0;
        while (true) {
            try {
                mhq mhqVar = new mhq(mimVar, mhtVarA);
                try {
                    try {
                        return elec.b(mhqVar);
                    } catch (mih e) {
                        int i2 = e.c;
                        String str2 = null;
                        if ((i2 == 307 || i2 == 308) && i < 5 && (map2 = e.d) != null && (list = (List) map2.get("Location")) != null && !list.isEmpty()) {
                            str2 = (String) list.get(0);
                        }
                        if (str2 == null) {
                            throw e;
                        }
                        i++;
                        mhs mhsVar2 = new mhs(mhtVarA);
                        mhsVar2.b(str2);
                        mhtVarA = mhsVar2.a();
                    }
                } finally {
                    mgb.T(mhqVar);
                }
            } catch (Exception e2) {
                mimVar.e();
                throw new nbb(e2);
            }
        }
    }
}
