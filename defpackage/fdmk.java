package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdmk extends fcxs implements fdlr {
    public static final fdmk a = new fdmk();

    private fdmk() {
        super(fdlr.c);
    }

    @Override // defpackage.fdlr
    @fcsv
    public final fdks hK(fdap fdapVar) {
        return fdml.a;
    }

    @Override // defpackage.fdlr
    @fcsv
    public final Object o(fcxy fcxyVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // defpackage.fdlr
    @fcsv
    public final CancellationException p() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // defpackage.fdlr
    @fcsv
    public final fdiz q(fdjb fdjbVar) {
        return fdml.a;
    }

    @Override // defpackage.fdlr
    @fcsv
    public final fdks s(boolean z, boolean z2, fdap fdapVar) {
        return fdml.a;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // defpackage.fdlr
    public final boolean v() {
        return true;
    }

    @Override // defpackage.fdlr
    public final boolean x() {
        return false;
    }

    @Override // defpackage.fdlr
    public final boolean y() {
        return false;
    }

    @Override // defpackage.fdlr
    @fcsv
    public final boolean z() {
        return false;
    }

    @Override // defpackage.fdlr
    @fcsv
    public final void t(CancellationException cancellationException) {
    }
}
