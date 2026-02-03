package defpackage;

import android.os.Bundle;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acla implements eind {
    final /* synthetic */ ackz a;

    public acla(ackz ackzVar) {
        this.a = ackzVar;
    }

    @Override // defpackage.eind
    public final /* bridge */ /* synthetic */ eine a(einb einbVar) {
        acin acinVarA = ((acmk) einbVar).a();
        acle acleVar = new acle();
        eyhj.e(acleVar);
        Bundle bundle = new Bundle();
        bundle.putString("advanced_feedback_data_description", acinVarA.f());
        bundle.putString("advanced_feedback_data_rationale", acinVarA.i());
        bundle.putString("advanced_feedback_data_name", acinVarA.g());
        bundle.putString("advanced_feedback_data_rationale_title", acinVarA.j());
        acleVar.at(bundle);
        ackz ackzVar = this.a;
        cg cgVar = new cg(ackzVar.a.a());
        cgVar.E(R.anim.enter, R.anim.exit);
        cgVar.D(R.id.advanced_feedback_fragment_container, acleVar);
        cgVar.A();
        cgVar.c();
        ackzVar.d = 2;
        return eine.a;
    }
}
