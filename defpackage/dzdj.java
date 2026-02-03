package defpackage;

import android.view.View;
import android.widget.PopupWindow;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzdj extends dzdu {
    public final ejwi a;
    public final ejwi b;
    public final View c;
    public final PopupWindow.OnDismissListener d;
    public final dyml e;

    public dzdj(ejwi ejwiVar, ejwi ejwiVar2, View view, PopupWindow.OnDismissListener onDismissListener, dyml dymlVar) {
        this.a = ejwiVar;
        this.b = ejwiVar2;
        this.c = view;
        this.d = onDismissListener;
        this.e = dymlVar;
    }

    @Override // defpackage.dzdu
    public final View a() {
        return this.c;
    }

    @Override // defpackage.dzdu
    public final PopupWindow.OnDismissListener b() {
        return this.d;
    }

    @Override // defpackage.dzdu
    public final ejwi c() {
        return this.a;
    }

    @Override // defpackage.dzdu
    public final ejwi d() {
        return this.b;
    }

    @Override // defpackage.dzdu
    public final dyml e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzdu) {
            dzdu dzduVar = (dzdu) obj;
            if (this.a.equals(dzduVar.c()) && this.b.equals(dzduVar.d()) && this.c.equals(dzduVar.a()) && this.d.equals(dzduVar.b())) {
                dzduVar.f();
                if (this.e.equals(dzduVar.e())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ 2) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        dyml dymlVar = this.e;
        PopupWindow.OnDismissListener onDismissListener = this.d;
        View view = this.c;
        ejwi ejwiVar = this.b;
        return "TooltipModel{backgroundColor=" + this.a.toString() + ", scrimColor=" + ejwiVar.toString() + ", contentView=" + view.toString() + ", dismissListener=" + onDismissListener.toString() + ", placement=BELOW, readyListener=" + dymlVar.toString() + "}";
    }

    @Override // defpackage.dzdu
    public final void f() {
    }
}
