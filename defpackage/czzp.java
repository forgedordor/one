package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.search.presenter.ContactFilterDataItem;
import com.google.android.apps.messaging.ui.search.presenter.FreeTextFilterDataItem;
import com.google.android.apps.messaging.ui.search.presenter.SearchFilterDataItem;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czzp implements cyum {
    public View a;
    private final Context b;
    private final fcsu c;
    private final rtj d = (rtj) new rtj().A();

    public czzp(Context context, fcsu fcsuVar) {
        this.b = context;
        this.c = fcsuVar;
    }

    @Override // defpackage.cyum
    public final Drawable a(Object obj) throws XmlPullParserException, Resources.NotFoundException, IOException {
        boolean z = obj instanceof SearchFilterDataItem;
        String string = obj.toString();
        if (z) {
            uri = obj instanceof ContactFilterDataItem ? ((ContactFilterDataItem) obj).a : null;
            string = ((SearchFilterDataItem) obj).e();
        }
        Context context = this.b;
        final eegx eegxVarH = eegx.h(context, true != ((asgw) this.c.b()).a() ? R.xml.zero_state_chip : R.xml.zero_state_chip_coolranch);
        eegxVarH.o(new eegw() { // from class: czzn
            @Override // defpackage.eegw
            public final void a() {
                eegx eegxVar = eegxVarH;
                eegxVar.setBounds(0, 0, eegxVar.getIntrinsicWidth(), eegxVar.getIntrinsicHeight());
            }
        });
        eegxVarH.p(string);
        if (uri != null) {
            int iRound = Math.round(eegxVarH.e);
            raw.c(context).f(uri).q(this.d).w(new czzo(this, iRound, iRound, eegxVarH));
        }
        eegxVarH.setBounds(0, 0, eegxVarH.getIntrinsicWidth(), eegxVarH.getIntrinsicHeight());
        return eegxVarH;
    }

    @Override // defpackage.cyum
    public final void b() {
        this.a = null;
    }

    @Override // defpackage.cyum
    public final void c(View view) {
        this.a = view;
    }

    @Override // defpackage.cyum
    public final boolean d(Object obj) {
        return (obj instanceof SearchFilterDataItem) && !(obj instanceof FreeTextFilterDataItem);
    }
}
