package defpackage;

import android.app.Activity;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxri extends cqdj {
    public static final /* synthetic */ int c = 0;
    final /* synthetic */ Activity a;
    final /* synthetic */ cxsa b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxri(cxsa cxsaVar, Activity activity) {
        super("Bugle.Async.DebugUtils.showUnreadMessagesDialog.Duration");
        this.a = activity;
        this.b = cxsaVar;
    }

    @Override // defpackage.cqdj
    protected final /* bridge */ /* synthetic */ Object a(Object[] objArr) {
        fcsu fcsuVar = this.b.q;
        crqv crqvVar = (crqv) fcsuVar.b();
        Activity activity = this.a;
        crqvVar.h(activity.getString(R.string.link_preview_tombstone_seen_pref_key), false);
        ((crqv) fcsuVar.b()).k(activity.getString(R.string.link_preview_tombstone_first_shown_millis_pref_key), -1L);
        String[] strArr = bpxj.a;
        new bpwz().d();
        String[] strArr2 = MessagesTable.a;
        brdk brdkVar = new brdk();
        brdkVar.c(new Function() { // from class: cxrh
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brec brecVar = (brec) obj;
                int i = cxri.c;
                brecVar.ae(210);
                return brecVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brdkVar.d();
        return null;
    }

    @Override // defpackage.cqdj
    protected final /* bridge */ /* synthetic */ void d(Object obj) {
        ((dakl) this.b.Y.b()).j("Link Previews reset to first view.");
    }
}
