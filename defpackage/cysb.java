package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
class cysb implements egzv<egbs> {
    final /* synthetic */ cysg a;

    public cysb(cysg cysgVar) {
        this.a = cysgVar;
    }

    @Override // defpackage.egzv
    public final void a(Throwable th) {
        ekrw ekrwVarJ = cysg.a.j();
        ekrwVarJ.X(eksq.a, "BugleGDitto");
        ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(th)).h("com/google/android/apps/messaging/ui/gaia/GaiaPairingSettingsFragmentPeer$2", "onError", (char) 224, "GaiaPairingSettingsFragmentPeer.java")).q("Failed to retrieve Gaia sign in status");
    }

    @Override // defpackage.egzv
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        boolean zEquals = ((egbs) obj).k.equals("pseudonymous");
        cysg cysgVar = this.a;
        cyrn cyrnVar = cysgVar.c;
        TextView textView = (TextView) cyrnVar.N().findViewById(R.id.instruction_list_item_step_one);
        TextView textView2 = (TextView) cyrnVar.N().findViewById(R.id.instruction_list_item_step_two);
        TextView textView3 = (TextView) cyrnVar.N().findViewById(R.id.instruction_list_item_step_three);
        View viewFindViewById = cyrnVar.N().findViewById(R.id.instruction_list_item_one);
        if (!zEquals) {
            viewFindViewById.setVisibility(8);
            Context context = cysgVar.g;
            textView2.setText(context.getResources().getString(R.string.instruction_how_to_pair_step_one));
            textView3.setText(context.getResources().getString(R.string.instruction_how_to_pair_step_two));
            return;
        }
        viewFindViewById.setVisibility(0);
        Context context2 = cysgVar.g;
        textView.setText(context2.getResources().getString(R.string.instruction_how_to_pair_step_one));
        textView2.setText(context2.getResources().getString(R.string.instruction_how_to_pair_step_two));
        textView3.setText(context2.getResources().getString(R.string.instruction_how_to_pair_step_three));
    }

    @Override // defpackage.egzv
    public final /* synthetic */ void hn() {
    }
}
