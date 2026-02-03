package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.datadonation.redact.RedactedSpan;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aatw implements eind {
    final /* synthetic */ aatv a;

    public aatw(aatv aatvVar) {
        this.a = aatvVar;
    }

    @Override // defpackage.eind
    public final /* bridge */ /* synthetic */ eine a(einb einbVar) {
        final aatv aatvVar = this.a;
        final aaul aaulVar = (aaul) einbVar;
        fcsu fcsuVar = aatvVar.c;
        View viewInflate = LayoutInflater.from((Context) fcsuVar.b()).inflate(R.layout.dialog_text_edit, (ViewGroup) null, false);
        ((TextView) viewInflate.findViewById(R.id.message_editor)).setText(aaulVar.c().c(aaulVar.a()));
        fcsu fcsuVar2 = aatvVar.b;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(((aatn) fcsuVar2.b()).B().getText(R.string.donation_edit_dialog_body_text));
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(((aatn) fcsuVar2.b()).B().getDimensionPixelSize(R.dimen.body_text_size)), 0, spannableStringBuilder.length(), 17);
        eeji eejiVar = new eeji((Context) fcsuVar.b());
        eejiVar.l(spannableStringBuilder);
        eejiVar.w(viewInflate);
        eejiVar.r(R.string.donation_edit_dialog_positive_button_label, new eigf((eigp) aatvVar.l.b(), "com/google/android/apps/messaging/datadonation/ui/DataDonationFragmentPeer", "getEditTextPositiveButton", 401, "DataDonationFragmentPeer#getEditTextPositiveButton", new DialogInterface.OnClickListener() { // from class: aatq
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                boolean z;
                Optional optionalOf;
                int i2;
                TextView textView = (TextView) ((iv) dialogInterface).findViewById(R.id.message_editor);
                textView.getClass();
                CharSequence text = textView.getText();
                ejwl.l(text instanceof Spanned);
                aauj aaujVar = aatvVar.p;
                aaujVar.getClass();
                Spanned spanned = (Spanned) text;
                aaul aaulVar2 = aaulVar;
                int iB = aaulVar2.b();
                int iA = aaulVar2.a();
                int i3 = 0;
                if (TextUtils.isEmpty(spanned)) {
                    z = false;
                } else {
                    aaut aautVar = (aaut) ((aauu) aaujVar.a.get(iB)).c.get(iA);
                    ejwl.a(!TextUtils.isEmpty(spanned));
                    Spanned spanned2 = aautVar.b;
                    cczv cczvVar = aave.a;
                    if (TextUtils.equals(spanned2, spanned)) {
                        optionalOf = Optional.empty();
                    } else {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spanned);
                        RedactedSpan[] redactedSpanArr = (RedactedSpan[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), RedactedSpan.class);
                        RedactedSpan[] redactedSpanArr2 = (RedactedSpan[]) spanned2.getSpans(0, spanned2.length(), RedactedSpan.class);
                        int length = redactedSpanArr.length;
                        int i4 = 0;
                        while (i4 < length) {
                            RedactedSpan redactedSpan = redactedSpanArr[i4];
                            int length2 = redactedSpanArr2.length;
                            int i5 = i3;
                            while (true) {
                                if (i5 >= length2) {
                                    spannableStringBuilder2.removeSpan(redactedSpan);
                                    break;
                                }
                                RedactedSpan redactedSpan2 = redactedSpanArr2[i5];
                                if (redactedSpan.a != redactedSpan2.a || !TextUtils.equals(spannableStringBuilder2.subSequence(spannableStringBuilder2.getSpanStart(redactedSpan), spannableStringBuilder2.getSpanEnd(redactedSpan)), spanned2.subSequence(spanned2.getSpanStart(redactedSpan2), spanned2.getSpanEnd(redactedSpan2)))) {
                                    i5++;
                                }
                            }
                            i4++;
                            i3 = 0;
                        }
                        aarz aarzVar = new aarz((String) aasb.a.e());
                        ekgb ekgbVarA = aarzVar.a(spanned2.toString());
                        ekgb ekgbVarA2 = aarzVar.a(spannableStringBuilder2.toString());
                        int[][] iArrA = aary.a(ekgbVarA, ekgbVarA2);
                        int i6 = ((ekoe) ekgbVarA).c;
                        int i7 = ((ekoe) ekgbVarA2).c;
                        int i8 = 0;
                        int i9 = 0;
                        int i10 = 0;
                        while (i6 > 0 && i7 > 0) {
                            int i11 = i6 - 1;
                            int[] iArr = iArrA[i11];
                            int i12 = i7 - 1;
                            int i13 = iArr[i12];
                            int i14 = iArr[i7];
                            if (i13 <= i14) {
                                int[] iArr2 = iArrA[i6];
                                i2 = i7;
                                if (i13 <= iArr2[i12]) {
                                    if (i13 < iArr2[i2]) {
                                        i10++;
                                    }
                                    i6 = i11;
                                }
                                i7 = i12;
                            } else {
                                i2 = i7;
                            }
                            if (i14 < iArrA[i6][i12]) {
                                i8++;
                                i7 = i2;
                                i6 = i11;
                            } else {
                                i9++;
                                i7 = i12;
                            }
                        }
                        int i15 = i7;
                        while (i6 > 0) {
                            i8++;
                            i6--;
                        }
                        for (int i16 = i15; i16 > 0; i16--) {
                            i9++;
                        }
                        optionalOf = Optional.of(new aavb(spannableStringBuilder2, new aarw(i9, i8, i10)));
                    }
                    if (!optionalOf.isEmpty()) {
                        aautVar.d = ((aavb) optionalOf.get()).b;
                        aautVar.c = ((aavb) optionalOf.get()).a;
                    }
                    z = true;
                }
                aaujVar.H(z, iB, iA);
            }
        }));
        eejiVar.m(android.R.string.cancel, null);
        final iv ivVarCreate = eejiVar.create();
        ivVarCreate.setOnShowListener(new DialogInterface.OnShowListener() { // from class: aatp
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                TextView textView = (TextView) ivVarCreate.findViewById(android.R.id.message);
                textView.getClass();
                textView.setPadding(textView.getPaddingLeft(), ((aatn) aatvVar.b.b()).B().getDimensionPixelOffset(R.dimen.dialog_message_top_padding), textView.getPaddingRight(), textView.getPaddingBottom());
            }
        });
        ivVarCreate.show();
        return eine.a;
    }
}
