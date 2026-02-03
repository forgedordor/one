package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uqi extends vo {
    public String a;
    final /* synthetic */ uqc d;
    private final boolean e;

    public uqi(uqc uqcVar, boolean z) {
        this.d = uqcVar;
        this.e = z;
    }

    @Override // defpackage.vo
    public final int a() {
        return l() ? 1 : 0;
    }

    @Override // defpackage.vo
    public final int dF(int i) {
        return R.layout.group_name;
    }

    @Override // defpackage.vo
    public final wv e(ViewGroup viewGroup, int i) {
        return new uqh(LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false));
    }

    @Override // defpackage.vo
    public final void g(wv wvVar, int i) {
        uqh uqhVar = (uqh) wvVar;
        uqhVar.t.setText(this.a);
        uqc uqcVar = this.d;
        if (uqcVar.B && !this.e) {
            uqhVar.u.setVisibility(8);
            return;
        }
        uqcVar.x.G();
        uqhVar.s.setOnClickListener(new eifs((eigp) uqcVar.t.b(), "com/google/android/apps/messaging/conversation/settings/ConversationSettingsBaseFragmentPeer$GroupNameAdapter", "onBindViewHolder", 872, "GroupNameViewHolder root onClickListener", new View.OnClickListener() { // from class: uqg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        }));
    }

    @Override // defpackage.vo
    public final long gH(int i) {
        return 2131624364L;
    }

    final boolean l() {
        return this.a != null;
    }
}
