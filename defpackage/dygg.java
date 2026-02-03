package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.material.progressindicator.LinearProgressIndicator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dygg extends dyhi {
    public LinearProgressIndicator y;
    public View z;

    public dygg(ViewGroup viewGroup, Context context, dyyb dyybVar) {
        super(viewGroup, context, dyybVar);
    }

    @Override // defpackage.dyhi
    protected final View D(ViewGroup viewGroup) {
        View viewInflate = LayoutInflater.from(this.s).inflate(R.layout.og_progress_card_content, viewGroup);
        this.z = viewInflate;
        LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) viewInflate.findViewById(R.id.og_card_progress_indicator);
        this.y = linearProgressIndicator;
        eeok eeokVar = linearProgressIndicator.a;
        if (eeokVar.c != 0.5f) {
            eeokVar.c = Math.min(0.5f, 0.5f);
            eeokVar.d = true;
            linearProgressIndicator.invalidate();
        }
        LinearProgressIndicator linearProgressIndicator2 = this.y;
        eeok eeokVar2 = linearProgressIndicator2.a;
        if (eeokVar2.i != 0) {
            eeokVar2.i = 0;
            eeokVar2.b();
            linearProgressIndicator2.invalidate();
        }
        LinearProgressIndicator linearProgressIndicator3 = this.y;
        eeps eepsVar = (eeps) linearProgressIndicator3.a;
        if (eepsVar.r != 0) {
            eepsVar.r = Math.min(0, eepsVar.a);
            eepsVar.b();
            linearProgressIndicator3.invalidate();
        }
        return this.z;
    }

    @Override // defpackage.dyhi, defpackage.dyfr
    protected final void E(lvj lvjVar) {
        super.E(lvjVar);
        ((dyge) this.x).getClass();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dyhi
    /* renamed from: G, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void H(lvj lvjVar, dyge dygeVar) {
        super.H(lvjVar, dygeVar);
        throw null;
    }
}
