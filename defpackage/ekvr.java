package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class ekvr {
    public ekwe b = null;
    public ekvg c = null;

    protected ekvr() {
    }

    public abstract ekvt a();

    public final void b(ekrz ekrzVar, Object obj) {
        if (obj == null) {
            return;
        }
        if (this.c == null) {
            this.c = new ekvg();
        }
        this.c.b.add(new ekvi(ekrzVar, obj));
    }

    public final void c(ekwe ekweVar) {
        ekwr.b(this.b == null, "tags already set");
        this.b = ekweVar;
    }
}
