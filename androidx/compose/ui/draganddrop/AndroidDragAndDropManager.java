package androidx.compose.ui.draganddrop;

import android.view.DragEvent;
import android.view.View;
import defpackage.csr;
import defpackage.css;
import defpackage.fdce;
import defpackage.icr;
import defpackage.ics;
import defpackage.ief;
import defpackage.ieh;
import defpackage.iei;
import defpackage.iek;
import defpackage.iel;
import defpackage.jdy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class AndroidDragAndDropManager implements View.OnDragListener {
    public final iek a = new iek(null);
    public final css b = new css((byte[]) null);
    public final ics c = new jdy<iek>() { // from class: androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1
        @Override // defpackage.jdy
        public final /* bridge */ /* synthetic */ icr d() {
            return this.a.a;
        }

        @Override // defpackage.jdy
        public final /* bridge */ /* synthetic */ void e(icr icrVar) {
        }

        public final boolean equals(Object obj) {
            return obj == this;
        }

        public final int hashCode() {
            return this.a.a.hashCode();
        }
    };

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        ief iefVar = new ief(dragEvent);
        switch (dragEvent.getAction()) {
            case 1:
                iek iekVar = this.a;
                fdce fdceVar = new fdce();
                iel.a(iekVar, new ieh(fdceVar));
                boolean z = fdceVar.a;
                csr csrVar = new csr(this.b);
                while (csrVar.hasNext()) {
                }
                break;
            case 2:
                this.a.f(iefVar);
                break;
            case 4:
                iel.a(this.a, new iei());
                this.b.clear();
            case 3:
                return false;
            case 6:
                this.a.a(iefVar);
            case 5:
                return false;
        }
        return false;
    }
}
