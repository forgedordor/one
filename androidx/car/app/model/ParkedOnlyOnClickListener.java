package androidx.car.app.model;

import defpackage.cmb;
import defpackage.col;

/* compiled from: PG */
@cmb
/* loaded from: classes.dex */
public final class ParkedOnlyOnClickListener implements col {
    private final col mListener;

    private ParkedOnlyOnClickListener(col colVar) {
        this.mListener = colVar;
    }

    public static ParkedOnlyOnClickListener create(col colVar) {
        colVar.getClass();
        return new ParkedOnlyOnClickListener(colVar);
    }

    @Override // defpackage.col
    public void onClick() {
        this.mListener.onClick();
    }
}
