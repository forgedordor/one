package defpackage;

import android.util.Property;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.onegoogle.popovercontainer.ExpandableDialogView;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dyod implements dyqd {
    final /* synthetic */ dzdb a;

    public dyod(dzdb dzdbVar) {
        this.a = dzdbVar;
    }

    @Override // defpackage.dyqd
    public final Runnable a() {
        final dzdb dzdbVar = this.a;
        return new Runnable() { // from class: dyoc
            @Override // java.lang.Runnable
            public final void run() {
                dzdbVar.hh();
            }
        };
    }

    @Override // defpackage.dyqd
    public final Runnable b() {
        final dzdb dzdbVar = this.a;
        return new Runnable() { // from class: dyob
            @Override // java.lang.Runnable
            public final void run() {
                ecem.c();
                ExpandableDialogView expandableDialogView = dzdbVar.am;
                if (expandableDialogView != null) {
                    View viewFindViewById = expandableDialogView.findViewById(R.id.og_container_disable_content_view);
                    viewFindViewById.setVisibility(0);
                    viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: dzck
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Property property = dzdb.ag;
                        }
                    });
                }
            }
        };
    }
}
