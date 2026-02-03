package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drxg extends drxi {
    private drxg(ejwi ejwiVar, drxj drxjVar) {
        super(ejwiVar, drxjVar);
    }

    public static drxg b() {
        drxg drxgVar = new drxg(ejud.a, drxj.a);
        super.c("");
        return drxgVar;
    }

    @Override // defpackage.drxi
    public final /* bridge */ /* synthetic */ Object a(final String str) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Item is empty");
        }
        if (str.charAt(str.length() - 1) != '*') {
            return new ejwm() { // from class: drxf
                @Override // defpackage.ejwm
                public final boolean a(Object obj) {
                    return ((String) obj).equals(str);
                }
            };
        }
        final String strSubstring = str.substring(0, str.length() - 1);
        return new ejwm() { // from class: drxe
            @Override // defpackage.ejwm
            public final boolean a(Object obj) {
                return ((String) obj).startsWith(strSubstring);
            }
        };
    }
}
