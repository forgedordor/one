package defpackage;

import android.net.Uri;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;
import com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery;
import com.google.android.apps.messaging.ui.generic.spannedautocomplete.SpannedMultiAutoCompleteTextView;
import com.google.android.apps.messaging.ui.search.ZeroStateSearchBox;
import com.google.android.apps.messaging.ui.search.presenter.ContactFilterDataItem;

/* compiled from: PG */
/* loaded from: classes3.dex */
class czzi implements egps<Recipient, Boolean> {
    final /* synthetic */ czzj a;

    public czzi(czzj czzjVar) {
        this.a = czzjVar;
    }

    @Override // defpackage.egps
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        Recipient recipient = (Recipient) obj;
        if (!((Boolean) obj2).booleanValue()) {
            this.a.a(recipient);
            return;
        }
        czzj czzjVar = this.a;
        ZeroStateSearchBox zeroStateSearchBox = czzjVar.B;
        fcsu fcsuVar = czzjVar.q;
        zeroStateSearchBox.j(((dach) fcsuVar.b()).b(new SearchQuery.ContentSearchFilter(6)));
        qxf qxfVarF = recipient.f();
        String str = qxfVarF.k;
        str.getClass();
        Uri uriA = qxfVarF.i;
        if (uriA == null) {
            uriA = ((axjf) czzjVar.s.b()).a(((anuh) czzjVar.t.b()).b(qxfVarF));
        }
        ContactFilterDataItem contactFilterDataItemA = ((dach) fcsuVar.b()).a(new SearchQuery.ParticipantSearchFilter(str), uriA, qxfVarF.b);
        View view = czzjVar.b.Q;
        view.getClass();
        SpannedMultiAutoCompleteTextView spannedMultiAutoCompleteTextView = (SpannedMultiAutoCompleteTextView) view.findViewById(R.id.zero_state_search_box_auto_complete);
        spannedMultiAutoCompleteTextView.j(spannedMultiAutoCompleteTextView.g(contactFilterDataItemA));
    }

    @Override // defpackage.egps
    public final /* bridge */ /* synthetic */ void f(Object obj, Throwable th) {
        ekrw ekrwVarH = czzj.a.h();
        ekrwVarH.X(eksq.a, "Bugle");
        ((ekrd) ((ekrd) ((ekrd) ekrwVarH).g(th)).h("com/google/android/apps/messaging/ui/search/ZeroStateSearchFragmentPeer$4", "onFailure", (char) 879, "ZeroStateSearchFragmentPeer.java")).q("Failed to check if the contact is a participant. Starting 1-1 conversation.");
        this.a.a((Recipient) obj);
    }

    @Override // defpackage.egps
    public final /* synthetic */ void b(Object obj) {
    }
}
