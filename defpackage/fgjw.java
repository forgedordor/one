package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgjw {
    public static fgkc a(fgjd fgjdVar, fgme fgmeVar, String str, String str2) {
        fglo fgloVar = fgjdVar.a;
        if (fgloVar == null || !fgloVar.a.equals("!")) {
            return new fgkc(new fgla(str, str2), fgmeVar.f());
        }
        fgkc fgkcVar = new fgkc(new fgky(str, str2), fgmeVar.f());
        fgkcVar.c = true;
        return fgkcVar;
    }
}
