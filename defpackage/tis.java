package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tis extends tiw {
    public final String a;
    public final Optional b;
    public final Optional c;
    public final Optional d;
    public final int e;
    private final ekgb f;

    public tis(String str, Optional optional, Optional optional2, Optional optional3, ekgb ekgbVar, int i) {
        this.a = str;
        this.b = optional;
        this.c = optional2;
        this.d = optional3;
        this.f = ekgbVar;
        this.e = i;
    }

    @Override // defpackage.tiw
    public final int a() {
        return this.e;
    }

    @Override // defpackage.tiw
    public final ekgb b() {
        return this.f;
    }

    @Override // defpackage.tiw
    public final Optional c() {
        return this.b;
    }

    @Override // defpackage.tiw
    public final Optional d() {
        return this.c;
    }

    @Override // defpackage.tiw
    public final Optional e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tiw) {
            tiw tiwVar = (tiw) obj;
            if (this.a.equals(tiwVar.f()) && this.b.equals(tiwVar.c()) && this.c.equals(tiwVar.d()) && this.d.equals(tiwVar.e()) && ekjz.h(this.f, tiwVar.b()) && this.e == tiwVar.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.tiw
    public final String f() {
        return this.a;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.e;
    }

    public final String toString() {
        ekgb ekgbVar = this.f;
        Optional optional = this.d;
        Optional optional2 = this.c;
        return "Request{displayDestination=" + this.a + ", newBlockStatus=" + String.valueOf(this.b) + ", newSpamStatus=" + String.valueOf(optional2) + ", undoAction=" + String.valueOf(optional) + ", snackbarInteractions=" + ekgbVar.toString() + ", anchorViewId=" + this.e + "}";
    }
}
