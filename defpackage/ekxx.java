package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekxx {
    public ekxw a = ekxw.NO_ERROR;
    public String b = "";

    public final void a(ekxw ekxwVar, String str, Object... objArr) {
        this.a = ekxwVar;
        this.b = ejxq.a(str.replace("%d", "%s"), objArr);
    }

    public final String toString() {
        ekxw ekxwVar = this.a;
        return ekxwVar == ekxw.NO_ERROR ? "OK" : ejxq.a("%s: %s", ekxwVar, this.b);
    }
}
