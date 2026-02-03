package com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData;
import com.google.protobuf.contrib.android.ProtoParsers;
import defpackage.bary;
import defpackage.bbey;
import defpackage.bbfa;
import defpackage.bbfc;
import defpackage.evrr;
import defpackage.evsn;
import defpackage.evuh;
import defpackage.evwl;
import defpackage.ezai;
import defpackage.ezaj;
import defpackage.ezal;
import defpackage.ezan;
import defpackage.ezbs;
import defpackage.ezbw;
import defpackage.ezcr;
import defpackage.ezdc;
import defpackage.ezei;
import defpackage.ezfp;
import defpackage.ezfr;
import defpackage.ezfv;
import defpackage.ezgf;
import defpackage.ezgg;
import defpackage.ezgh;
import defpackage.ezgi;
import defpackage.ezgk;
import defpackage.fdbk;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class SmartSuggestionItemSuggestionData implements SmartSuggestionData {
    public static final Parcelable.Creator<SmartSuggestionItemSuggestionData> CREATOR = new bbey();
    public final String a;
    public bbfc b;
    public ezgi c;

    public SmartSuggestionItemSuggestionData(ezgi ezgiVar, String str, bbfc bbfcVar) {
        this.a = str;
        this.b = bbfcVar;
        this.c = ezgiVar;
    }

    @Override // defpackage.aldp
    public final String a() {
        ezgi ezgiVar = this.c;
        int i = ezgiVar.c;
        if (i == 15) {
            String str = ((ezfp) ezgiVar.d).b;
            str.getClass();
            return str;
        }
        if (i != 2) {
            return "";
        }
        String str2 = ((ezgk) ezgiVar.d).c;
        str2.getClass();
        return str2;
    }

    @Override // defpackage.aldp
    public final String b() {
        return this.a;
    }

    @Override // defpackage.aldp
    public final String c() {
        ezgg ezggVar = this.c.e;
        if (ezggVar == null) {
            ezggVar = ezgg.b;
        }
        String str = ezggVar.q;
        str.getClass();
        return str;
    }

    @Override // defpackage.aldp
    public final String d() {
        ezgi ezgiVar = this.c;
        ezgiVar.getClass();
        ezgk ezgkVar = ezgiVar.c == 2 ? (ezgk) ezgiVar.d : null;
        if (ezgkVar == null || (ezgkVar.b & 1) == 0) {
            return a();
        }
        String str = ((ezgk) ezgiVar.d).d;
        str.getClass();
        return str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.aldp
    public final String e() {
        ezgg ezggVar = this.c.e;
        if (ezggVar == null) {
            ezggVar = ezgg.b;
        }
        ezan ezanVarB = ezan.b(ezggVar.l);
        if (ezanVarB == null) {
            ezanVarB = ezan.UNRECOGNIZED;
        }
        return ezanVarB.name();
    }

    @Override // defpackage.aldp
    public final boolean f() {
        return bbfa.c(this) || bbfa.a(bbfa.b(this)) == ezan.CATEGORY_EMOTIVE;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData
    public final float g() {
        ezgg ezggVar = this.c.e;
        if (ezggVar == null) {
            ezggVar = ezgg.b;
        }
        return ezggVar.f;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData
    public final int h() {
        ezgi ezgiVar = this.c;
        return (ezgiVar.c == 28 ? (ezfr) ezgiVar.d : ezfr.a).c;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData
    public final long i() {
        ezgi ezgiVar = this.c;
        return (ezgiVar.c == 17 ? (ezfv) ezgiVar.d : ezfv.a).f;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData
    public final ezai j() {
        ezgg ezggVar = this.c.e;
        if (ezggVar == null) {
            ezggVar = ezgg.b;
        }
        ezai ezaiVarB = ezai.b(ezggVar.d);
        if (ezaiVarB == null) {
            ezaiVarB = ezai.UNRECOGNIZED;
        }
        ezaiVarB.getClass();
        return ezaiVarB;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData
    public final ezal k() {
        ezgg ezggVar = this.c.e;
        if (ezggVar == null) {
            ezggVar = ezgg.b;
        }
        ezal ezalVarB = ezal.b(ezggVar.g);
        if (ezalVarB == null) {
            ezalVarB = ezal.UNRECOGNIZED;
        }
        ezalVarB.getClass();
        return ezalVarB;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData
    public final ezan l() {
        ezgg ezggVar = this.c.e;
        if (ezggVar == null) {
            ezggVar = ezgg.b;
        }
        ezan ezanVarB = ezan.b(ezggVar.l);
        if (ezanVarB == null) {
            ezanVarB = ezan.UNRECOGNIZED;
        }
        ezanVarB.getClass();
        return ezanVarB;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData
    public final ezgi m() {
        return this.c;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData
    public final String n() {
        ezgi ezgiVar = this.c;
        String str = (ezgiVar.c == 6 ? (ezbs) ezgiVar.d : ezbs.a).h;
        str.getClass();
        return str;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData
    public final String o() {
        ezgi ezgiVar = this.c;
        String str = (ezgiVar.c == 13 ? (ezcr) ezgiVar.d : ezcr.a).b;
        str.getClass();
        return str;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData
    public final String p() {
        ezgi ezgiVar = this.c;
        String str = (ezgiVar.c == 5 ? (ezdc) ezgiVar.d : ezdc.a).b;
        str.getClass();
        return str;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData
    public final String q() {
        ezgi ezgiVar = this.c;
        return (ezgiVar.c == 29 ? (ezbw) ezgiVar.d : ezbw.a).b;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData
    public final String r() {
        ezgi ezgiVar = this.c;
        String str = (ezgiVar.c == 18 ? (ezei) ezgiVar.d : ezei.a).b;
        str.getClass();
        return str;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData
    public final String s() {
        ezgi ezgiVar = this.c;
        String str = (ezgiVar.c == 28 ? (ezfr) ezgiVar.d : ezfr.a).b;
        str.getClass();
        return str;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData
    public final String t() {
        ezgi ezgiVar = this.c;
        String str = (ezgiVar.c == 13 ? (ezcr) ezgiVar.d : ezcr.a).d;
        str.getClass();
        return str;
    }

    public final String toString() {
        Locale locale = Locale.US;
        ezgg ezggVar = this.c.e;
        if (ezggVar == null) {
            ezggVar = ezgg.b;
        }
        Integer numValueOf = Integer.valueOf(ezggVar.l);
        ezgg ezggVar2 = this.c.e;
        String str = (ezggVar2 == null ? ezgg.b : ezggVar2).m;
        if (ezggVar2 == null) {
            ezggVar2 = ezgg.b;
        }
        String str2 = String.format(locale, "{type=%d, targetMessageId=%s, suggestionId=%s}", Arrays.copyOf(new Object[]{numValueOf, str, ezggVar2.k}, 3));
        str2.getClass();
        return str2;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData
    public final String u() {
        ezgi ezgiVar = this.c;
        String str = (ezgiVar.c == 13 ? (ezcr) ezgiVar.d : ezcr.a).c;
        str.getClass();
        return str;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData
    public final void v(ezai ezaiVar) {
        ezgg ezggVar = this.c.e;
        if (ezggVar == null) {
            ezggVar = ezgg.b;
        }
        ezgf ezgfVar = (ezgf) ezggVar.toBuilder();
        ezgfVar.copyOnWrite();
        ((ezgg) ezgfVar.instance).d = ezaiVar.a();
        evsn evsnVarBuild = ezgfVar.build();
        evsnVarBuild.getClass();
        ezgh ezghVar = (ezgh) this.c.toBuilder();
        ezghVar.copyOnWrite();
        ezgi ezgiVar = (ezgi) ezghVar.instance;
        ezgiVar.e = (ezgg) evsnVarBuild;
        ezgiVar.b |= 1;
        evsn evsnVarBuild2 = ezghVar.build();
        evsnVarBuild2.getClass();
        this.c = (ezgi) evsnVarBuild2;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData
    public final MessageIdType w() {
        ezgg ezggVar = this.c.e;
        if (ezggVar == null) {
            ezggVar = ezgg.b;
        }
        return bary.b(ezggVar.m);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(new ProtoParsers.InternalDontUse(null, this.c), 0);
        parcel.writeParcelable(new ProtoParsers.InternalDontUse(null, this.b), 0);
    }

    public final ezaj x() {
        ezgg ezggVar = this.c.e;
        if (ezggVar == null) {
            ezggVar = ezgg.b;
        }
        ezaj ezajVarB = ezaj.b(ezggVar.e);
        if (ezajVarB == null) {
            ezajVarB = ezaj.UNRECOGNIZED;
        }
        ezajVarB.getClass();
        return ezajVarB;
    }

    public /* synthetic */ SmartSuggestionItemSuggestionData(ezgi ezgiVar, String str, bbfc bbfcVar, fdbk fdbkVar) {
        this(ezgiVar, str, bbfcVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SmartSuggestionItemSuggestionData(Parcel parcel, fdbk fdbkVar) {
        Parcelable parcelable = parcel.readParcelable(ezgi.class.getClassLoader());
        parcelable.getClass();
        evuh evuhVarA = ((evwl) parcelable).a(ezgi.a, evrr.a());
        evuhVarA.getClass();
        Parcelable parcelable2 = parcel.readParcelable(bbfc.class.getClassLoader());
        parcelable2.getClass();
        evuh evuhVarA2 = ((evwl) parcelable2).a(bbfc.a, evrr.a());
        evuhVarA2.getClass();
        this((ezgi) evuhVarA, (bbfc) evuhVarA2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SmartSuggestionItemSuggestionData(ezgi ezgiVar) {
        ezgiVar.getClass();
        bbfc bbfcVar = bbfc.a;
        bbfcVar.getClass();
        this(ezgiVar, "", bbfcVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SmartSuggestionItemSuggestionData(ezgi ezgiVar, bbfc bbfcVar) {
        this(ezgiVar, "", bbfcVar);
        ezgiVar.getClass();
        bbfcVar.getClass();
    }

    public /* synthetic */ SmartSuggestionItemSuggestionData(ezgi ezgiVar, bbfc bbfcVar, int i, fdbk fdbkVar) {
        this(ezgiVar, (i & 2) != 0 ? bbfc.a : bbfcVar);
    }
}
