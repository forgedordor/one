package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbwj {
    public static volatile fbsy a;
    private static volatile fbrk b;
    private static volatile fbrk c;
    private static volatile fbrk d;

    private dbwj() {
    }

    public static fbrk a() {
        fbrk fbrkVarA;
        fbrk fbrkVar = d;
        if (fbrkVar != null) {
            return fbrkVar;
        }
        synchronized (dbwj.class) {
            fbrkVarA = d;
            if (fbrkVarA == null) {
                fbrh fbrhVarA = fbrk.a();
                fbrhVarA.c = fbrj.UNARY;
                fbrhVarA.d = fbrk.c("com.google.android.gms.backup.customd2dapi.CustomD2DSourceService", "GetCustomD2DItem");
                fbrhVarA.b();
                dbwo dbwoVar = dbwo.a;
                evrr evrrVar = fcrj.a;
                fbrhVarA.a = new fcrh(dbwoVar);
                fbrhVarA.b = new fcrh(dbwq.a);
                fbrkVarA = fbrhVarA.a();
                d = fbrkVarA;
            }
        }
        return fbrkVarA;
    }

    public static fbrk b() {
        fbrk fbrkVarA;
        fbrk fbrkVar = c;
        if (fbrkVar != null) {
            return fbrkVar;
        }
        synchronized (dbwj.class) {
            fbrkVarA = c;
            if (fbrkVarA == null) {
                fbrh fbrhVarA = fbrk.a();
                fbrhVarA.c = fbrj.UNARY;
                fbrhVarA.d = fbrk.c("com.google.android.gms.backup.customd2dapi.CustomD2DSourceService", "GetMetadata");
                fbrhVarA.b();
                dbws dbwsVar = dbws.a;
                evrr evrrVar = fcrj.a;
                fbrhVarA.a = new fcrh(dbwsVar);
                fbrhVarA.b = new fcrh(dbwu.a);
                fbrkVarA = fbrhVarA.a();
                c = fbrkVarA;
            }
        }
        return fbrkVarA;
    }

    public static fbrk c() {
        fbrk fbrkVarA;
        fbrk fbrkVar = b;
        if (fbrkVar != null) {
            return fbrkVar;
        }
        synchronized (dbwj.class) {
            fbrkVarA = b;
            if (fbrkVarA == null) {
                fbrh fbrhVarA = fbrk.a();
                fbrhVarA.c = fbrj.UNARY;
                fbrhVarA.d = fbrk.c("com.google.android.gms.backup.customd2dapi.CustomD2DSourceService", "Handshake");
                fbrhVarA.b();
                dbww dbwwVar = dbww.a;
                evrr evrrVar = fcrj.a;
                fbrhVarA.a = new fcrh(dbwwVar);
                fbrhVarA.b = new fcrh(dbwy.a);
                fbrkVarA = fbrhVarA.a();
                b = fbrkVarA;
            }
        }
        return fbrkVarA;
    }
}
