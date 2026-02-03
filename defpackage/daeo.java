package defpackage;

import android.content.DialogInterface;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.search.presenter.SelectedSearchResult;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class daeo extends dadr {
    public dacs ag;
    public daga ah;
    public aijh ai;
    public avmp aj;
    public dacu ak;
    public fcsu al;
    public fcsu am;
    private daer an;

    private final daer be() {
        if (this.an == null) {
            daer daerVar = new daer(z(), this.Z, new daen());
            this.an = daerVar;
            daerVar.a(this.Q);
        }
        return this.an;
    }

    @Override // defpackage.dafz
    public final int aX() {
        return R.layout.zero_state_search_location_action_dialog;
    }

    @Override // defpackage.dafz
    public final dacu aY() {
        return this.ak;
    }

    @Override // defpackage.dafz
    public final void aZ(View view) {
        this.ah = new daga(G(), this.ai, this.aj, this.al, (tlt) this.am.b(), 5);
        view.findViewById(R.id.search_bottom_sheet_chips_container).setVisibility(0);
        view.findViewById(R.id.zero_state_search_location_dialog_jump_to_chat_button).setOnClickListener(new View.OnClickListener() { // from class: daej
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                daeo daeoVar = this.a;
                dacs dacsVar = daeoVar.ag;
                if (dacsVar != null) {
                    daeoVar.ah.b(dacsVar.e(), daeoVar.ag.f());
                }
            }
        });
        view.findViewById(R.id.zero_state_search_location_dialog_maps_button).setOnClickListener(new View.OnClickListener() { // from class: daek
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.a.bc();
            }
        });
        view.findViewById(R.id.zero_state_search_location_dialog_copy_button).setOnClickListener(new View.OnClickListener() { // from class: dael
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                daeo daeoVar = this.a;
                dacs dacsVar = daeoVar.ag;
                if (dacsVar != null) {
                    daeoVar.ah.a(dacsVar.k(), R.string.zero_state_search_location_copied);
                }
            }
        });
        view.findViewById(R.id.zero_state_search_location_dialog_share_button).setOnClickListener(new View.OnClickListener() { // from class: daem
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                daeo daeoVar = this.a;
                dacs dacsVar = daeoVar.ag;
                if (dacsVar != null) {
                    daeoVar.ah.c(dacsVar.k());
                }
            }
        });
        Rect rect = new Rect();
        TextView textView = (TextView) view.findViewById(R.id.zero_state_search_location_street_level_address);
        textView.setOnClickListener(new View.OnClickListener() { // from class: daei
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.a.bc();
            }
        });
        textView.getHitRect(rect);
        Rect rect2 = new Rect();
        view.findViewById(R.id.zero_state_search_location_image).getHitRect(rect2);
        if (view.getLayoutDirection() == 1) {
            eebx.a(textView, view, rect.left - rect2.left, 0, rect2.height() - rect.height());
        } else {
            eebx.a(textView, view, 0, rect2.right - rect.right, rect2.height() - rect.height());
        }
    }

    public final void bc() {
        dacs dacsVar = this.ag;
        if (dacsVar != null) {
            daga dagaVar = this.ah;
            String strH = dacsVar.h();
            if (TextUtils.isEmpty(strH)) {
                return;
            }
            ((dabm) dagaVar.c.b()).i(dagaVar.d);
            dagaVar.b.t(dagaVar.a, strH);
        }
    }

    @Override // defpackage.dafz
    public final boolean bd() {
        dacu dacuVar = this.ak;
        SelectedSearchResult selectedSearchResult = (SelectedSearchResult) dacuVar.i().a();
        dacj dacjVar = (dacj) dacuVar.g().a();
        if (selectedSearchResult == null || selectedSearchResult.b() != 5 || dacjVar == null || dacjVar.a().f().isEmpty()) {
            return false;
        }
        dacs dacsVar = (dacs) dacjVar.d().get(selectedSearchResult.a());
        this.ag = dacsVar;
        dacsVar.n();
        be().b(this.ag);
        View viewFindViewById = this.Q.findViewById(R.id.zero_state_search_location_dialog_maps_button);
        if (TextUtils.isEmpty(this.ag.h())) {
            viewFindViewById.setVisibility(8);
            return true;
        }
        viewFindViewById.setVisibility(0);
        return true;
    }

    @Override // defpackage.dafz, defpackage.dn, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        be().c();
    }
}
