package androidx.car.app.model;

import defpackage.cmb;
import defpackage.cpa;
import j$.util.Objects;

/* compiled from: PG */
@cmb
/* loaded from: classes.dex */
public final class RowSection extends Section<Row> {
    private final int mInitialSelectedIndex;

    private RowSection() {
        this.mInitialSelectedIndex = -1;
    }

    @Override // androidx.car.app.model.Section
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RowSection)) {
            return false;
        }
        RowSection rowSection = (RowSection) obj;
        return super.equals(rowSection) && this.mInitialSelectedIndex == rowSection.mInitialSelectedIndex;
    }

    public int getInitialSelectedIndex() {
        return this.mInitialSelectedIndex;
    }

    @Override // androidx.car.app.model.Section
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), Integer.valueOf(this.mInitialSelectedIndex));
    }

    public boolean isSelectionGroup() {
        return this.mInitialSelectedIndex >= 0;
    }

    @Override // androidx.car.app.model.Section
    public String toString() {
        return "RowSection { initialSelectedIndex: " + this.mInitialSelectedIndex + ", " + super.toString() + " }";
    }

    private RowSection(cpa cpaVar) {
        super(cpaVar);
        int i = cpaVar.a;
        this.mInitialSelectedIndex = 0;
    }
}
