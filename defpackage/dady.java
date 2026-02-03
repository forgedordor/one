package defpackage;

import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.UrlSearchResult;
import com.google.android.apps.messaging.ui.search.presenter.SelectedSearchResult;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dady extends dadq {
    public aijh ag;
    public avmp ah;
    public dacu ai;
    public fcsu aj;
    public fcsu ak;
    public fcsu al;
    dacq am;
    daga an;

    @Override // defpackage.dafz
    public final int aX() {
        return R.layout.zero_state_search_link_action_dialog;
    }

    @Override // defpackage.dafz
    public final dacu aY() {
        return this.ai;
    }

    @Override // defpackage.dafz
    public final void aZ(View view) {
        this.an = new daga(G(), this.ag, this.ah, this.aj, (tlt) this.ak.b(), 4);
        view.findViewById(R.id.search_bottom_sheet_chips_container).setVisibility(0);
        ((Button) view.findViewById(R.id.zero_state_search_dialog_jump_to_chat_button)).setOnClickListener(new View.OnClickListener() { // from class: dads
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                dady dadyVar = this.a;
                dacq dacqVar = dadyVar.am;
                if (dacqVar != null) {
                    UrlSearchResult urlSearchResultK = dacqVar.k();
                    daga dagaVar = dadyVar.an;
                    ajsn ajsnVar = (ajsn) dadyVar.al.b();
                    ConversationIdType conversationIdTypeJ = urlSearchResultK.j();
                    urlSearchResultK.aA(20, "participant_normalized_destination");
                    dagaVar.b(ajsnVar.a(conversationIdTypeJ, urlSearchResultK.u, urlSearchResultK.t()), urlSearchResultK.k());
                }
            }
        });
        ((Button) view.findViewById(R.id.zero_state_search_dialog_open_in_browser_button)).setOnClickListener(new View.OnClickListener() { // from class: dadt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.a.bc();
            }
        });
        ((Button) view.findViewById(R.id.zero_state_search_dialog_copy_button)).setOnClickListener(new View.OnClickListener() { // from class: dadu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                dady dadyVar = this.a;
                dacq dacqVar = dadyVar.am;
                if (dacqVar != null) {
                    dadyVar.an.a(dacqVar.o(), R.string.zero_state_search_link_copied);
                }
            }
        });
        ((Button) view.findViewById(R.id.zero_state_search_dialog_share_button)).setOnClickListener(new View.OnClickListener() { // from class: dadv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                dady dadyVar = this.a;
                dacq dacqVar = dadyVar.am;
                if (dacqVar != null) {
                    dadyVar.an.c(dacqVar.o());
                }
            }
        });
        Rect rect = new Rect();
        TextView textView = (TextView) view.findViewById(R.id.zero_state_search_link_title);
        textView.setOnClickListener(new View.OnClickListener() { // from class: dadw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.a.bc();
            }
        });
        textView.getHitRect(rect);
        Rect rect2 = new Rect();
        view.findViewById(R.id.zero_state_search_link_image).getHitRect(rect2);
        if (view.getLayoutDirection() == 1) {
            eebx.a(textView, view, rect.left - rect2.left, 0, rect2.height() - rect.height());
        } else {
            eebx.a(textView, view, 0, rect2.right - rect.right, rect2.height() - rect.height());
        }
    }

    public final void bc() {
        dacq dacqVar = this.am;
        if (dacqVar != null) {
            String strO = dacqVar.o();
            daga dagaVar = this.an;
            cqaz.f(TextUtils.isEmpty(strO));
            ((dabm) dagaVar.c.b()).i(dagaVar.d);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(strO));
            dagaVar.a.startActivity(intent);
        }
    }

    @Override // defpackage.dafz
    public final boolean bd() {
        dacu dacuVar = this.ai;
        SelectedSearchResult selectedSearchResult = (SelectedSearchResult) dacuVar.i().a();
        dacj dacjVar = (dacj) dacuVar.g().a();
        if (selectedSearchResult == null || selectedSearchResult.b() != 4) {
            return false;
        }
        dacjVar.c();
        if (((ekoe) dacjVar.c()).c <= selectedSearchResult.a()) {
            return false;
        }
        this.am = (dacq) dacjVar.c().get(selectedSearchResult.a());
        View view = this.Q;
        cqaz.l(this.am);
        new daeg(z(), Q(), view, new dadx()).C(this.am);
        return true;
    }
}
