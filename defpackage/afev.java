package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.lighterconversation.LighterConversationActivity;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afev implements MenuItem.OnMenuItemClickListener {
    final /* synthetic */ afew a;

    public afev(afew afewVar) {
        this.a = afewVar;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        eg egVarFg = this.a.b.fg();
        if (!(egVarFg instanceof LighterConversationActivity)) {
            return true;
        }
        LighterConversationActivity lighterConversationActivity = ((LighterConversationActivity) egVarFg).H().b;
        Intent intent = lighterConversationActivity.getIntent();
        efwo efwoVar = (efwo) intent.getParcelableExtra("account_id");
        if (efwoVar == null) {
            afej.a.m("Account ID null!");
            lighterConversationActivity.finish();
            return true;
        }
        Bundle bundle = new Bundle();
        bundle.putSerializable("account_context", intent.getSerializableExtra("account_context"));
        bundle.putSerializable("conversation_id", (Serializable) intent.getParcelableExtra("conversation_id"));
        afex afexVar = new afex();
        eyhj.e(afexVar);
        ehok.b(afexVar, efwoVar);
        afexVar.at(bundle);
        cg cgVar = new cg(lighterConversationActivity.a());
        cgVar.t(R.id.lighter_conversation_fragment_container, afexVar, "LIGHTER_SETTINGS_FRAGMENT");
        cgVar.c();
        return true;
    }
}
