package androidx.car.app.model;

import defpackage.cmb;
import defpackage.cog;
import j$.util.Objects;

/* compiled from: PG */
@cmb
/* loaded from: classes.dex */
public final class Metadata {
    public static final Metadata EMPTY_METADATA = new Metadata(new cog());
    private final Place mPlace;

    private Metadata() {
        this.mPlace = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Metadata) {
            return Objects.equals(this.mPlace, ((Metadata) obj).mPlace);
        }
        return false;
    }

    public Place getPlace() {
        return this.mPlace;
    }

    public int hashCode() {
        return Objects.hashCode(this.mPlace);
    }

    public Metadata(cog cogVar) {
        Place place = cogVar.a;
        this.mPlace = null;
    }
}
