package defpackage;

import android.content.Context;
import android.widget.LinearLayout;

/* compiled from: PG */
/* loaded from: classes5.dex */
class edpx extends LinearLayout implements eyhy, eyhr {
    private eyhq a;
    public boolean i;

    public edpx(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        eyhx eyhxVarA = ba().a();
        if (eyhxVarA instanceof eyhx) {
            if ((!(eyhxVarA instanceof eyhr) || ((eyhr) eyhxVarA).e()) && !this.i) {
                this.i = true;
                ((edpw) bb()).aD((edpv) this);
            }
        }
    }

    @Override // defpackage.eyhx
    public final Object bb() {
        return ba().bb();
    }

    @Override // defpackage.eyhy
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final eyhq ba() {
        if (this.a == null) {
            this.a = new eyhq(this, true);
        }
        return this.a;
    }

    @Override // defpackage.eyhr
    public final boolean e() {
        return this.i;
    }
}
