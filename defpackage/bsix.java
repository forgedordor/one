package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bsix extends dqtb {
    public bsix() {
        super("parts", "$primary");
    }

    public final void a(Function function) {
        String[] strArr = PartsTable.a;
        this.b = new bsji((bsjl) function.apply(new bsjl()));
    }

    @Override // defpackage.dqtb
    public final /* bridge */ /* synthetic */ dqta b() {
        return new bsiw(this.a.a(), this.b);
    }
}
