package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.attachment.VCardAttachmentView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwwc extends cvjm {
    public final fcsu f;
    public final cwvy g;

    public cwwc(fcsu fcsuVar, eidm eidmVar, Context context, cwvy cwvyVar) {
        super(context, eidmVar);
        this.f = fcsuVar;
        this.g = cwvyVar;
    }

    @Override // defpackage.cvjm
    public final /* bridge */ /* synthetic */ wv F(Context context, ViewGroup viewGroup) {
        VCardAttachmentView vCardAttachmentView = (VCardAttachmentView) LayoutInflater.from(context).inflate(R.layout.people_list_item_view_m2, viewGroup, false);
        cwwb cwwbVar = new cwwb(this, vCardAttachmentView);
        vCardAttachmentView.f(cwwbVar);
        return cwwbVar;
    }

    @Override // defpackage.vo
    public final long gH(int i) {
        bcut bcutVar;
        if (!this.a || (bcutVar = this.d) == null || bcutVar.isClosed() || !this.d.moveToPosition(i)) {
            return 0L;
        }
        return this.d.u().a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cvjm
    public final /* bridge */ /* synthetic */ void l(wv wvVar, Cursor cursor) {
        cwwb cwwbVar = (cwwb) wvVar;
        cwwbVar.s.M(cursor);
        ((VCardAttachmentView) cwwbVar.a).e(cwwbVar.t);
    }
}
