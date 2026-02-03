package defpackage;

import com.google.communication.synapse.security.scytale.DbWrapperFactory;
import com.google.communication.synapse.security.scytale.DbWrapperInterface;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bwbm extends DbWrapperFactory {
    final /* synthetic */ bwlt a;

    public bwbm(bwlt bwltVar) {
        this.a = bwltVar;
    }

    @Override // com.google.communication.synapse.security.scytale.DbWrapperFactory
    public final DbWrapperInterface createDbWrapper() {
        return this.a;
    }
}
