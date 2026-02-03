package androidx.car.app.model;

import defpackage.cmb;
import defpackage.cny;
import defpackage.coj;
import defpackage.coy;
import defpackage.crk;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
@cmb
/* loaded from: classes.dex */
public final class Row implements cny {
    public static final int IMAGE_TYPE_EXTRA_SMALL = 8;
    public static final int IMAGE_TYPE_ICON = 4;
    public static final int IMAGE_TYPE_LARGE = 2;
    public static final int IMAGE_TYPE_SMALL = 1;
    public static final int NO_DECORATION = -1;
    private static final String YOUR_BOAT = "🚣";
    private final List<Action> mActions;
    private final CarIcon mImage;
    private final boolean mIndexable;
    private final boolean mIsBrowsable;
    private final boolean mIsEnabled;
    private final Metadata mMetadata;
    private final int mNumericDecoration;
    private final coj mOnClickDelegate;
    private final int mRowImageType;
    private final List<CarText> mTexts;
    private final CarText mTitle;
    private final Toggle mToggle;

    private Row() {
        this.mTitle = null;
        this.mTexts = Collections.EMPTY_LIST;
        this.mImage = null;
        this.mActions = Collections.EMPTY_LIST;
        this.mNumericDecoration = -1;
        this.mToggle = null;
        this.mOnClickDelegate = null;
        this.mMetadata = Metadata.EMPTY_METADATA;
        this.mIsBrowsable = false;
        this.mRowImageType = 1;
        this.mIsEnabled = true;
        this.mIndexable = true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Row)) {
            return false;
        }
        Row row = (Row) obj;
        if (Objects.equals(this.mTitle, row.mTitle) && Objects.equals(this.mTexts, row.mTexts) && Objects.equals(this.mImage, row.mImage) && Objects.equals(this.mToggle, row.mToggle)) {
            if (Objects.equals(Boolean.valueOf(this.mOnClickDelegate == null), Boolean.valueOf(row.mOnClickDelegate == null)) && Objects.equals(this.mMetadata, row.mMetadata) && this.mIsBrowsable == row.mIsBrowsable && this.mRowImageType == row.mRowImageType && this.mIsEnabled == row.isEnabled() && this.mIndexable == row.mIndexable) {
                return true;
            }
        }
        return false;
    }

    public List<Action> getActions() {
        return this.mActions;
    }

    public CarIcon getImage() {
        return this.mImage;
    }

    public Metadata getMetadata() {
        return this.mMetadata;
    }

    public int getNumericDecoration() {
        return this.mNumericDecoration;
    }

    public coj getOnClickDelegate() {
        return this.mOnClickDelegate;
    }

    public int getRowImageType() {
        return this.mRowImageType;
    }

    public List<CarText> getTexts() {
        return crk.a(this.mTexts);
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public Toggle getToggle() {
        return this.mToggle;
    }

    public int hashCode() {
        return Objects.hash(this.mTitle, this.mTexts, this.mImage, this.mToggle, Boolean.valueOf(this.mOnClickDelegate == null), this.mMetadata, Boolean.valueOf(this.mIsBrowsable), Integer.valueOf(this.mRowImageType), Boolean.valueOf(this.mIsEnabled), Boolean.valueOf(this.mIndexable));
    }

    public boolean isBrowsable() {
        return this.mIsBrowsable;
    }

    public boolean isEnabled() {
        return this.mIsEnabled;
    }

    public boolean isIndexable() {
        return this.mIndexable;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[title: ");
        sb.append(CarText.toShortString(this.mTitle));
        sb.append(", text count: ");
        List<CarText> list = this.mTexts;
        sb.append(list != null ? list.size() : 0);
        sb.append(", image: ");
        sb.append(this.mImage);
        sb.append(", isBrowsable: ");
        sb.append(this.mIsBrowsable);
        sb.append(", isEnabled: ");
        sb.append(this.mIsEnabled);
        sb.append("]");
        return sb.toString();
    }

    public CharSequence yourBoat() {
        return YOUR_BOAT;
    }

    public Row(coy coyVar) {
        this.mTitle = coyVar.b;
        this.mTexts = crk.b(coyVar.c);
        CarIcon carIcon = coyVar.d;
        this.mImage = null;
        this.mActions = crk.b(coyVar.e);
        int i = coyVar.f;
        this.mNumericDecoration = -1;
        Toggle toggle = coyVar.g;
        this.mToggle = null;
        coj cojVar = coyVar.h;
        this.mOnClickDelegate = null;
        this.mMetadata = coyVar.i;
        boolean z = coyVar.j;
        this.mIsBrowsable = false;
        int i2 = coyVar.k;
        this.mRowImageType = 1;
        boolean z2 = coyVar.a;
        this.mIsEnabled = true;
        boolean z3 = coyVar.l;
        this.mIndexable = true;
    }

    public Row row() {
        return this;
    }
}
