package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wyr implements amwe {
    final /* synthetic */ cilo a;
    final /* synthetic */ Map b;

    public wyr(cilo ciloVar, Map map) {
        this.a = ciloVar;
        this.b = map;
    }

    @Override // defpackage.amwe
    public final int a() {
        return this.a.c;
    }

    @Override // defpackage.amwe
    public final int b() {
        return this.a.b;
    }

    @Override // defpackage.amwe
    public final amwd c() {
        return amwd.MENTION;
    }

    @Override // defpackage.amwe
    public final ResolvedRecipient d() {
        return (ResolvedRecipient) this.b.get(this.a.e);
    }

    @Override // defpackage.amwe
    public final /* bridge */ /* synthetic */ String e() {
        return null;
    }

    @Override // defpackage.amwe
    public final /* bridge */ /* synthetic */ String f() {
        return null;
    }

    @Override // defpackage.amwe
    public final int g() {
        return 4;
    }
}
