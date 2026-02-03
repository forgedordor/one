package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class edxs extends jgl implements eyhy {
    private eyhq a;
    private boolean b;

    public edxs(Context context) {
        super(context);
        if (isInEditMode() || this.b) {
            return;
        }
        this.b = true;
        ((eeay) bb()).P((edzh) this);
    }

    @Override // defpackage.eyhy
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final eyhq ba() {
        if (this.a == null) {
            this.a = new eyhq(this, false);
        }
        return this.a;
    }

    @Override // defpackage.eyhx
    public final Object bb() {
        return ba().bb();
    }
}
