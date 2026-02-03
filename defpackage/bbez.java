package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bbez {
    public static final SmartSuggestionItemSuggestionData a(brlo brloVar) {
        brloVar.getClass();
        ezgi ezgiVarP = brloVar.p();
        ezgg ezggVar = ezgiVarP.e;
        if (ezggVar == null) {
            ezggVar = ezgg.b;
        }
        evsf builder = ezggVar.toBuilder();
        builder.getClass();
        ezgf ezgfVar = (ezgf) builder;
        ezgh ezghVar = (ezgh) ezgiVarP.toBuilder();
        ezai ezaiVarM = brloVar.m();
        ezgfVar.copyOnWrite();
        ((ezgg) ezgfVar.instance).d = ezaiVarM.a();
        ezaj ezajVarN = brloVar.n();
        ezgfVar.copyOnWrite();
        ((ezgg) ezgfVar.instance).e = ezajVarN.a();
        ezghVar.copyOnWrite();
        ezgi ezgiVar = (ezgi) ezghVar.instance;
        ezgg ezggVar2 = (ezgg) ezgfVar.build();
        ezggVar2.getClass();
        ezgiVar.e = ezggVar2;
        ezgiVar.b |= 1;
        evsn evsnVarBuild = ezghVar.build();
        evsnVarBuild.getClass();
        String strQ = brloVar.q();
        strQ.getClass();
        return new SmartSuggestionItemSuggestionData((ezgi) evsnVarBuild, strQ, bbfc.a);
    }
}
