package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'a' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: PG */
/* loaded from: classes5.dex */
public class ejul {
    public static final ejul a;
    public static final ejul b;
    public static final ejul c;
    public static final ejul d;
    public static final ejul e;
    private static final /* synthetic */ ejul[] h;
    public final ejvf f;
    public final String g;

    static {
        final ejuv ejuvVar = new ejuv('-');
        ejul ejulVar = new ejul(ejuvVar) { // from class: ejui
        };
        a = ejulVar;
        final ejuv ejuvVar2 = new ejuv('_');
        ejul ejulVar2 = new ejul(ejuvVar2) { // from class: ejuj
        };
        b = ejulVar2;
        ejul ejulVar3 = new ejul("LOWER_CAMEL", 2, new ejuu('A', 'Z'), "");
        c = ejulVar3;
        ejul ejulVar4 = new ejul("UPPER_CAMEL", 3, new ejuu('A', 'Z'), "");
        d = ejulVar4;
        final ejuv ejuvVar3 = new ejuv('_');
        ejul ejulVar5 = new ejul(ejuvVar3) { // from class: ejuk
        };
        e = ejulVar5;
        h = new ejul[]{ejulVar, ejulVar2, ejulVar3, ejulVar4, ejulVar5};
    }

    public ejul(String str, int i, ejvf ejvfVar, String str2) {
        this.f = ejvfVar;
        this.g = str2;
    }

    private static String b(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return ejuf.b(str.charAt(0)) + ejuf.c(str.substring(1));
    }

    public static ejul[] values() {
        return (ejul[]) h.clone();
    }

    public final String a(String str) {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return ejuf.c(str);
        }
        if (iOrdinal == 1) {
            return ejuf.c(str);
        }
        if (iOrdinal == 2) {
            return b(str);
        }
        if (iOrdinal == 3) {
            return b(str);
        }
        if (iOrdinal == 4) {
            return ejuf.d(str);
        }
        throw null;
    }
}
