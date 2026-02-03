package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpcm implements rez {
    @Override // defpackage.rez
    public final /* bridge */ /* synthetic */ rhy a(Object obj, int i, int i2, rex rexVar) throws Throwable {
        InputStream inputStream = (InputStream) obj;
        inputStream.getClass();
        rexVar.getClass();
        qol qolVarC = qnu.c(inputStream, null);
        Throwable th = qolVarC.b;
        if (th != null) {
            throw th;
        }
        Object obj2 = qolVarC.a;
        if (obj2 != null) {
            return new rnl(obj2);
        }
        return null;
    }

    @Override // defpackage.rez
    public final /* bridge */ /* synthetic */ boolean b(Object obj, rex rexVar) {
        ((InputStream) obj).getClass();
        rexVar.getClass();
        return true;
    }
}
