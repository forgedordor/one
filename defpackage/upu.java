package defpackage;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class upu extends uqs {
    protected abstract ea G(upx upxVar);

    @Override // defpackage.cukn, defpackage.cukf, defpackage.cukc, defpackage.cukp, defpackage.ecdl, defpackage.eg, defpackage.abi, defpackage.hl, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.conversation_settings_activity_gm3);
        if (bundle == null) {
            String stringExtra = getIntent().getStringExtra("conversation_id");
            stringExtra.getClass();
            ConversationIdType conversationIdTypeB = barn.b(stringExtra);
            boolean booleanExtra = getIntent().getBooleanExtra("is_group_conversation", false);
            boolean booleanExtra2 = getIntent().getBooleanExtra("is_rcs_conversation", false);
            boolean booleanExtra3 = getIntent().getBooleanExtra("is_e2ee_rcs_conversation", false);
            boolean booleanExtra4 = getIntent().getBooleanExtra("has_been_e2ee", false);
            int intExtra = getIntent().getIntExtra("conversation_state", 0);
            int intExtra2 = getIntent().getIntExtra("conversation_send_mode", 0);
            int intExtra3 = getIntent().getIntExtra("conversation_settings_launch_source", 0);
            avoe avoeVarB = avoe.b(getIntent().getIntExtra("conversation_error_state", 0));
            if (avoeVarB == null) {
                avoeVarB = avoe.NONE;
            }
            cqce cqceVar = uqc.a;
            upw upwVar = (upw) upx.a.createBuilder();
            String strA = conversationIdTypeB.a();
            upwVar.copyOnWrite();
            upx upxVar = (upx) upwVar.instance;
            strA.getClass();
            upxVar.b = strA;
            upwVar.copyOnWrite();
            ((upx) upwVar.instance).c = booleanExtra;
            upwVar.copyOnWrite();
            ((upx) upwVar.instance).d = booleanExtra2;
            upwVar.copyOnWrite();
            ((upx) upwVar.instance).e = intExtra;
            upwVar.copyOnWrite();
            ((upx) upwVar.instance).f = avoeVarB.a();
            upwVar.copyOnWrite();
            ((upx) upwVar.instance).g = booleanExtra3;
            upwVar.copyOnWrite();
            ((upx) upwVar.instance).h = booleanExtra4;
            upwVar.copyOnWrite();
            ((upx) upwVar.instance).i = intExtra2;
            upwVar.copyOnWrite();
            ((upx) upwVar.instance).j = intExtra3;
            ea eaVarG = G((upx) upwVar.build());
            cg cgVar = new cg(a());
            cgVar.x(R.id.fragment_container, eaVarG, "settings");
            cgVar.c();
        }
        im imVarK = k();
        if (imVarK != null) {
            imVarK.setDisplayHomeAsUpEnabled(true);
        }
        Toolbar toolbarFb = fb();
        if (toolbarFb != null) {
            toolbarFb.t(new View.OnClickListener() { // from class: upt
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.c().d();
                }
            });
        }
    }
}
