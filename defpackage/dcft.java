package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcft extends BasePendingResult {
    private final dcfx a;

    public dcft(dcfx dcfxVar) {
        super(null);
        this.a = dcfxVar;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final dcfx a(Status status) {
        return this.a;
    }
}
