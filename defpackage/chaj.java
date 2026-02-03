package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chaj {
    public static final long a(cgxy cgxyVar) {
        cgxyVar.getClass();
        return cgxyVar.j;
    }

    public static final cgxy b(long j) {
        Object next;
        fcue fcueVar = new fcue((fcuh) cgxy.i);
        while (true) {
            if (!fcueVar.hasNext()) {
                next = null;
                break;
            }
            next = fcueVar.next();
            if (((cgxy) next).j == ((int) j)) {
                break;
            }
        }
        cgxy cgxyVar = (cgxy) next;
        return cgxyVar == null ? cgxy.a : cgxyVar;
    }
}
