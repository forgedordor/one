package defpackage;

import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aype implements aymj {
    private final aypd a;

    public aype(aypd aypdVar) {
        this.a = aypdVar;
    }

    @Override // defpackage.aymj
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        this.a.a();
    }

    @Override // defpackage.aymj
    public final /* bridge */ /* synthetic */ void b(Action action, Object obj) {
        List list = (List) obj;
        if (list == null) {
            this.a.a();
        } else {
            this.a.b(list);
        }
    }
}
