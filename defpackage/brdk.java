package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class brdk extends dqtb {
    public brdk() {
        super("messages", "$primary");
    }

    @Override // defpackage.dqtb
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final brdj b() {
        return new brdj(this.a.a(), this.b);
    }

    public final void c(Function function) {
        String[] strArr = MessagesTable.a;
        this.b = new brdv((brec) function.apply(new brec()));
    }
}
