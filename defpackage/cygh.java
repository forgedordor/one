package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.diagnostics.DumpDatabaseAction;
import j$.util.function.Consumer$CC;
import java.io.IOException;
import java.util.Map;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cygh {
    public final Context a;
    public final fcsu b;
    private final eosc c;

    public cygh(Context context, eosc eoscVar, fcsu fcsuVar) {
        context.getClass();
        eoscVar.getClass();
        fcsuVar.getClass();
        this.a = context;
        this.c = eoscVar;
        this.b = fcsuVar;
    }

    public static final void c(Context context, Uri uri, boolean z) throws IOException {
        kxc kxcVar = new kxc(context);
        kxcVar.c("Share Messages db");
        kxcVar.d("application/sql");
        kxcVar.b(uri);
        Intent intentA = kxcVar.a();
        intentA.setFlags(1);
        if (z) {
            intentA.addFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
        }
        intentA.getClass();
        eiid.o(context, intentA);
    }

    private final void d(final Context context, DumpDatabaseAction dumpDatabaseAction) {
        auvh.i(eiju.g(dumpDatabaseAction.s()), new Consumer() { // from class: cygg
            @Override // java.util.function.Consumer
            public final void accept(Object obj) throws IOException {
                cygh.c(context, (Uri) obj, false);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, this.c);
    }

    public final void a(Context context, aazm aazmVar) {
        aazmVar.getClass();
        aazn aaznVar = (aazn) this.b.b();
        Context context2 = (Context) aaznVar.a.b();
        context2.getClass();
        fcsu fcsuVar = aaznVar.b;
        Map map = (Map) aaznVar.c.b();
        map.getClass();
        d(context, new DumpDatabaseAction(context2, fcsuVar, map, aazmVar));
    }

    public final void b(Context context, boolean z) {
        d(context, ((aazn) this.b.b()).b(z));
    }
}
