package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csdk {
    public static final csdl a(int i) {
        fcue fcueVar = new fcue((fcuh) csdl.m);
        while (fcueVar.hasNext()) {
            csdl csdlVar = (csdl) fcueVar.next();
            if (csdlVar.n == i) {
                return csdlVar;
            }
        }
        return csdl.a;
    }

    public static final csdl b(int i) {
        switch (i - 2) {
            case 0:
                return csdl.a;
            case 1:
                return csdl.c;
            case 2:
                return csdl.e;
            case 3:
                return csdl.d;
            case 4:
                return csdl.f;
            case 5:
                return csdl.g;
            case 6:
                return csdl.h;
            case 7:
                return csdl.i;
            case 8:
                return csdl.j;
            case 9:
                return csdl.k;
            case 10:
                return csdl.l;
            default:
                return csdl.a;
        }
    }
}
