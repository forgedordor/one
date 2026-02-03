package defpackage;

import android.content.Context;
import android.widget.LinearLayout;

/* compiled from: PG */
/* loaded from: classes5.dex */
class edpy extends LinearLayout implements eyhy, eyhr {
    public boolean a;
    private eyhq b;

    public edpy(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        eyhx eyhxVarA = ba().a();
        if (eyhxVarA instanceof eyhx) {
            if ((!(eyhxVarA instanceof eyhr) || ((eyhr) eyhxVarA).e()) && !this.a) {
                this.a = true;
                ((edqc) bb()).aE((edqb) this);
            }
        }
    }

    @Override // defpackage.eyhy
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final eyhq ba() {
        if (this.b == null) {
            this.b = new eyhq(this, true);
        }
        return this.b;
    }

    @Override // defpackage.eyhx
    public final Object bb() {
        return ba().bb();
    }

    @Override // defpackage.eyhr
    public final boolean e() {
        return this.a;
    }
}
