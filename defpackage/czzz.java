package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.ui.mediaviewer.MediaViewerButton;
import com.google.android.apps.messaging.ui.mediaviewer.MediaViewerCloseButtonEvent;
import com.google.android.apps.messaging.ui.mediaviewer.MediaViewerOpenInChatButtonEvent;
import com.google.android.apps.messaging.ui.mediaviewer.MediaViewerSaveButtonEvent;
import com.google.android.apps.messaging.ui.mediaviewer.MediaViewerShareButtonEvent;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czzz implements czzy {
    private final ajhd a;

    public czzz(ajhd ajhdVar) {
        this.a = ajhdVar;
    }

    @Override // defpackage.czzy
    public final void a(eg egVar, int i) {
        fr frVarA = egVar.a();
        if (i == 5) {
            if (frVarA.h("LocationBottomSheetDialogFragment") == null) {
                new daeo().t(frVarA, "LocationBottomSheetDialogFragment");
            }
        } else {
            if (i != 4) {
                throw new UnsupportedOperationException(a.g(i, "Unknown result type "));
            }
            if (frVarA.h("LinkBottomSheetDialogFragment") == null) {
                new dady().t(frVarA, "LinkBottomSheetDialogFragment");
            }
        }
    }

    @Override // defpackage.czzy
    public final void b(eg egVar, ConversationIdType conversationIdType, String str, boolean z, int i, String str2) {
        if (egVar.a().h("SearchDetails") == null) {
            czne czneVar = new czne();
            czneVar.a = conversationIdType;
            czneVar.b = str;
            czneVar.c = z;
            czneVar.d = i;
            czneVar.g = str2;
            czmj czmjVarE = MediaViewerButton.e();
            czmjVarE.e(R.string.action_jump_to_chat);
            czmjVarE.b(R.string.action_jump_to_chat);
            czmjVarE.c(new MediaViewerOpenInChatButtonEvent());
            czneVar.h = czmjVarE.a();
            czmj czmjVarE2 = MediaViewerButton.e();
            czmjVarE2.b(R.string.media_viewer_save_media_description);
            czmjVarE2.d(R.drawable.quantum_ic_save_alt_white_24);
            czmjVarE2.c(new MediaViewerSaveButtonEvent());
            MediaViewerButton mediaViewerButtonA = czmjVarE2.a();
            czmj czmjVarE3 = MediaViewerButton.e();
            czmjVarE3.b(R.string.media_viewer_share_media_description);
            czmjVarE3.d(R.drawable.quantum_gm_ic_share_white_24);
            czmjVarE3.c(new MediaViewerShareButtonEvent());
            czneVar.i = new ArrayList(ekgb.s(mediaViewerButtonA, czmjVarE3.a()));
            czmj czmjVarE4 = MediaViewerButton.e();
            czmjVarE4.b(R.string.discard);
            czmjVarE4.c(new MediaViewerCloseButtonEvent());
            czneVar.j = czmjVarE4.a();
            czneVar.b(4);
            czneVar.l = 3;
            czmk czmkVarA = czneVar.a();
            cg cgVar = new cg(egVar.a());
            cgVar.x(R.id.zero_state_fragment_container, czmkVarA, "SearchDetails");
            cgVar.v(null);
            cgVar.j();
            egVar.a().al();
            this.a.L(5);
        }
    }
}
