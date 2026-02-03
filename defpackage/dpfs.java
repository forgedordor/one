package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class dpfs extends lox implements eyhy {
    private eyhq a;
    private boolean b;

    public dpfs(Context context) {
        super(context);
        if (isInEditMode() || this.b) {
            return;
        }
        this.b = true;
        ((dpfr) bb()).F((dpfq) this);
    }

    @Override // defpackage.eyhx
    public final Object bb() {
        return ba().bb();
    }

    @Override // defpackage.eyhy
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final eyhq ba() {
        if (this.a == null) {
            this.a = new eyhq(this, false);
        }
        return this.a;
    }
}
