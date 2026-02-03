package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejoq {
    public final ezgy a;
    public final ezgy b;
    public final String c;
    public final String d;
    public boolean e;
    public boolean f;
    public final float g;

    public ejoq(ezgu ezguVar) {
        ezgy ezgyVar;
        ezgy ezgyVar2;
        this.e = false;
        this.f = false;
        if ((ezguVar.b & 1) != 0) {
            ezgyVar = ezguVar.e;
            if (ezgyVar == null) {
                ezgyVar = ezgy.a;
            }
        } else {
            ezgyVar = ejor.a;
        }
        this.a = ezgyVar;
        if ((ezguVar.b & 2) != 0) {
            ezgyVar2 = ezguVar.f;
            if (ezgyVar2 == null) {
                ezgyVar2 = ezgy.a;
            }
        } else {
            ezgyVar2 = ejor.b;
        }
        this.b = ezgyVar2;
        String str = ezguVar.c == 2 ? (String) ezguVar.d : "";
        if (str.isEmpty()) {
            this.c = "";
        } else {
            this.c = str;
            this.e = true;
        }
        String str2 = ezguVar.c == 1 ? (String) ezguVar.d : "";
        if (str2.isEmpty()) {
            this.d = "";
        } else {
            this.d = str2;
            this.f = true;
        }
        this.g = ezguVar.g;
    }
}
