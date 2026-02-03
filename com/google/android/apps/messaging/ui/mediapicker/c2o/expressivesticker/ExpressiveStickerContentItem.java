package com.google.android.apps.messaging.ui.mediapicker.c2o.expressivesticker;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.VisualContentItem;
import defpackage.btct;
import defpackage.bwvy;
import defpackage.cyxn;
import defpackage.elha;
import defpackage.eryy;
import defpackage.etxy;
import defpackage.etyb;
import defpackage.etyp;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ExpressiveStickerContentItem extends VisualContentItem {
    public static final Parcelable.Creator<ExpressiveStickerContentItem> CREATOR = new cyxn();
    public final String a;

    public ExpressiveStickerContentItem(Uri uri, String str, int i, int i2, String str2, elha elhaVar) {
        elha elhaVar2;
        super(uri, str, (elhaVar == elha.STICKER_CHOOSER || elhaVar == (elhaVar2 = elha.EXPRESSIVE_STICKER_CHOOSER) || elhaVar == elha.EXPRESSIVE_STICKER_PACK_DETAILS || elhaVar == elha.EXPRESSIVE_STICKER_GALLERY_SEARCH) ? elhaVar : elhaVar2, i, i2);
        this.a = str2;
    }

    @Override // com.google.android.apps.messaging.ui.mediapicker.c2o.content.MediaContentItem
    public final Uri a() {
        return this.b;
    }

    @Override // com.google.android.apps.messaging.ui.mediapicker.c2o.content.MediaContentItem
    public final String b() {
        return this.c;
    }

    @Override // com.google.android.apps.messaging.ui.mediapicker.c2o.content.MediaContentItem
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ExpressiveStickerContentItem) {
            return Objects.equals(this.a, ((ExpressiveStickerContentItem) obj).a);
        }
        return false;
    }

    @Override // com.google.android.apps.messaging.ui.mediapicker.c2o.content.MediaContentItem
    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    @Override // com.google.android.apps.messaging.ui.mediapicker.c2o.content.VisualContentItem, com.google.android.apps.messaging.ui.mediapicker.c2o.content.MediaContentItem, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.a);
    }

    public ExpressiveStickerContentItem(Parcel parcel) {
        super(parcel);
        String string = parcel.readString();
        string.getClass();
        this.a = string;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ExpressiveStickerContentItem(btct btctVar) {
        Uri uriK = btctVar.k();
        btctVar.aA(2, "content_type");
        String str = btctVar.c;
        btctVar.aA(3, "width");
        int i = btctVar.d;
        btctVar.aA(4, "height");
        this(uriK, str, i, btctVar.e, btctVar.m(), elha.EXPRESSIVE_STICKER_CHOOSER);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ExpressiveStickerContentItem(etyp etypVar, elha elhaVar) {
        etyb etybVar = etypVar.e;
        Uri uri = Uri.parse((etybVar == null ? etyb.a : etybVar).c);
        etyb etybVar2 = etypVar.e;
        String strA = bwvy.a(etybVar2 == null ? etyb.a : etybVar2);
        etyb etybVar3 = etypVar.e;
        etxy etxyVar = (etybVar3 == null ? etyb.a : etybVar3).f;
        int i = (etxyVar == null ? etxy.a : etxyVar).b;
        etyb etybVar4 = etypVar.e;
        etxy etxyVar2 = (etybVar4 == null ? etyb.a : etybVar4).f;
        this(uri, strA, i, (etxyVar2 == null ? etxy.a : etxyVar2).c, etypVar.c, elhaVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ExpressiveStickerContentItem(etyp etypVar, eryy eryyVar) {
        elha elhaVar;
        etyb etybVar = etypVar.e;
        Uri uri = Uri.parse((etybVar == null ? etyb.a : etybVar).c);
        etyb etybVar2 = etypVar.e;
        String strA = bwvy.a(etybVar2 == null ? etyb.a : etybVar2);
        etyb etybVar3 = etypVar.e;
        etxy etxyVar = (etybVar3 == null ? etyb.a : etybVar3).f;
        int i = (etxyVar == null ? etxy.a : etxyVar).b;
        etyb etybVar4 = etypVar.e;
        etxy etxyVar2 = (etybVar4 == null ? etyb.a : etybVar4).f;
        int i2 = (etxyVar2 == null ? etxy.a : etxyVar2).c;
        String str = etypVar.c;
        int iOrdinal = eryyVar.ordinal();
        if (iOrdinal != 4) {
            elhaVar = iOrdinal != 12 ? elha.EXPRESSIVE_STICKER_CHOOSER : elha.EXPRESSIVE_STICKER_PACK_DETAILS;
        } else {
            elhaVar = elha.EXPRESSIVE_STICKER_GALLERY_SEARCH;
        }
        this(uri, strA, i, i2, str, elhaVar);
    }
}
