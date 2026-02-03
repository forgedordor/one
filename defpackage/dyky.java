package defpackage;

import android.content.Context;
import com.google.android.libraries.onegoogle.accountmenu.features.education.db.EducationDatabase;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyky {
    public final Context a;
    public final Executor b;
    public final ekfw c;
    public EducationDatabase d;
    public dykx e;

    public dyky(Context context, Executor executor) {
        int i = ekgb.d;
        this.c = new ekfw();
        this.e = new dykx() { // from class: dykw
            @Override // defpackage.dykx
            public final void a() {
            }
        };
        context.getClass();
        this.a = context;
        this.b = new eoss(executor);
    }
}
