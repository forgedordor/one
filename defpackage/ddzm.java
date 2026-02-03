package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.phenotype.Configurations;
import com.google.android.gms.phenotype.DogfoodsToken;
import com.google.android.gms.phenotype.ExperimentTokens;
import com.google.android.gms.phenotype.Flag;
import com.google.android.gms.phenotype.FlagOverrides;
import com.google.android.gms.phenotype.internal.IPhenotypeCallbacks;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ddzm extends IPhenotypeCallbacks.Stub {
    private final defr a;

    public ddzm(defr defrVar) {
        this.a = defrVar;
    }

    @Override // com.google.android.gms.phenotype.internal.IPhenotypeCallbacks
    public final void onCommitToConfiguration(Status status) {
        dcjb.a(status, this.a);
    }

    @Override // com.google.android.gms.phenotype.internal.IPhenotypeCallbacks
    public final void onDogfoodsTokenRetrieved(Status status, DogfoodsToken dogfoodsToken) {
        dcjb.b(status, dogfoodsToken, this.a);
    }

    @Override // com.google.android.gms.phenotype.internal.IPhenotypeCallbacks
    public final void onDogfoodsTokenSet(Status status) {
        dcjb.a(status, this.a);
    }

    @Override // com.google.android.gms.phenotype.internal.IPhenotypeCallbacks
    public final void onExperimentTokensRetrieved(Status status, ExperimentTokens experimentTokens) {
        dcjb.b(status, experimentTokens, this.a);
    }

    @Override // com.google.android.gms.phenotype.internal.IPhenotypeCallbacks
    public final void onGetCommittedConfiguration(Status status, Configurations configurations) {
        dcjb.b(status, configurations, this.a);
    }

    @Override // com.google.android.gms.phenotype.internal.IPhenotypeCallbacks
    public final void onGetConfigurationSnapshot(Status status, Configurations configurations) {
        dcjb.b(status, configurations, this.a);
    }

    @Override // com.google.android.gms.phenotype.internal.IPhenotypeCallbacks
    public final void onGetFlag(Status status, Flag flag) {
        dcjb.b(status, flag, this.a);
    }

    @Override // com.google.android.gms.phenotype.internal.IPhenotypeCallbacks
    public final void onGetServingVersion(Status status, long j) {
        dcjb.b(status, Long.valueOf(j), this.a);
    }

    @Override // com.google.android.gms.phenotype.internal.IPhenotypeCallbacks
    public final void onListOrDeleteFlagOverrides(Status status, FlagOverrides flagOverrides) {
        dcjb.b(status, flagOverrides, this.a);
    }

    @Override // com.google.android.gms.phenotype.internal.IPhenotypeCallbacks
    public final void onRegistered(Status status) {
        dcjb.a(status, this.a);
    }

    @Override // com.google.android.gms.phenotype.internal.IPhenotypeCallbacks
    public final void onSetAppSpecificProperties(Status status) {
        dcjb.a(status, this.a);
    }

    @Override // com.google.android.gms.phenotype.internal.IPhenotypeCallbacks
    public final void onSetDimensions(Status status) {
        dcjb.a(status, this.a);
    }

    @Override // com.google.android.gms.phenotype.internal.IPhenotypeCallbacks
    public final void onSetFlagOverride(Status status) {
        dcjb.a(status, this.a);
    }

    @Override // com.google.android.gms.phenotype.internal.IPhenotypeCallbacks
    public final void onSyncAfter(Status status, long j) {
        dcjb.b(status, null, this.a);
    }

    @Override // com.google.android.gms.phenotype.internal.IPhenotypeCallbacks
    public final void onUnregistered(Status status) {
        dcjb.a(status, this.a);
    }

    @Override // com.google.android.gms.phenotype.internal.IPhenotypeCallbacks
    public final void onWeakRegistered(Status status) {
        dcjb.a(status, this.a);
    }
}
