package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bbef implements alez {
    private final String a;
    private final amwf c;
    private final alfd b = alfd.a;
    private final elny d = elny.PHONE_SMART_REPLY;

    public bbef(final SmartSuggestionItemSuggestionData smartSuggestionItemSuggestionData) {
        this.a = smartSuggestionItemSuggestionData.a;
        this.c = new amwf() { // from class: bbee
            @Override // defpackage.amwf
            public final /* synthetic */ ekgb a() {
                int i = ekgb.d;
                return ekoe.a;
            }

            @Override // defpackage.amwf, defpackage.amvr
            public final /* synthetic */ String b() {
                return "text/plain";
            }

            @Override // defpackage.amwf
            public final String c() {
                return smartSuggestionItemSuggestionData.a();
            }
        };
    }

    @Override // defpackage.alff
    public final alfd a() {
        return this.b;
    }

    @Override // defpackage.alff
    public final String b() {
        return this.a;
    }

    @Override // defpackage.alez
    public final amwf h() {
        return this.c;
    }

    @Override // defpackage.alez
    public final elny i() {
        return this.d;
    }
}
