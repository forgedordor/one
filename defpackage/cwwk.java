package defpackage;

import android.database.Cursor;
import android.support.v7.widget.RecyclerView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.common.ListEmptyView;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwwk extends cwwl implements badh, cwvy {
    public final cwwe a;
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu h;
    public RecyclerView i;
    public ListEmptyView j;
    public cwwc k;
    public cwwj l;
    public boolean m;
    public final babw g = new babw();
    public envd n = envd.UNKNOWN_INTENT_SOURCE;
    public final AtomicInteger o = new AtomicInteger(0);

    public cwwk(cwwe cwweVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6) {
        this.a = cwweVar;
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
        this.h = fcsuVar4;
        this.e = fcsuVar5;
        this.f = fcsuVar6;
    }

    @Override // defpackage.badh
    public final void r(badi badiVar, Cursor cursor) {
        this.g.e(badiVar);
        cwwc cwwcVar = this.k;
        if (cursor != cwwcVar.d) {
            if (cursor == null) {
                cwwcVar.d = null;
            } else if (cursor instanceof bcut) {
                cwwcVar.d = (bcut) cursor;
            } else {
                cwwcVar.d = bcve.a(cursor);
            }
            if (cursor != null) {
                cursor.getColumnIndex("_id");
                ((cpav) cwwcVar).a = true;
                cwwcVar.p();
            } else {
                ((cpav) cwwcVar).a = false;
                cwwcVar.p();
            }
        }
        if (cursor != null) {
            if (cursor.getCount() != 0) {
                this.j.setVisibility(8);
            } else {
                this.j.b(R.string.conversation_list_empty_text);
                this.j.setVisibility(0);
            }
        }
    }
}
