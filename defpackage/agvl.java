package defpackage;

import android.content.ClipData;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Objects;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agvl extends fcyz implements fdat {
    final /* synthetic */ agvz a;
    final /* synthetic */ agvf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agvl(agvz agvzVar, agvf agvfVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = agvzVar;
        this.b = agvfVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((agvl) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        final agvz agvzVar = this.a;
        agvzVar.f.c("Bugle.Penpal.UI.ReauthenticateDialog.Launch");
        Context context = agvzVar.c;
        String string = context.getString(R.string.penpal_auth_dialog_title);
        String string2 = context.getString(R.string.penpal_auth_dialog_body);
        string2.getClass();
        String string3 = context.getString(R.string.penpal_auth_dialog_ok);
        string3.getClass();
        final agvf agvfVar = this.b;
        dktq dktqVar = new dktq(string3, new fdae() { // from class: agvj
            @Override // defpackage.fdae
            public final Object invoke() throws IOException {
                eieh eiehVar;
                Throwable th;
                eieh eiehVar2;
                String str;
                String str2;
                lch lchVar;
                lch lchVar2;
                lch lchVar3;
                lci lciVar;
                lci lciVar2;
                Uri uri;
                agvz agvzVar2 = agvzVar;
                eieh eiehVarA = agvzVar2.j.a("PenpalReauthenticateHandler::Relogin");
                agvf agvfVar2 = agvfVar;
                try {
                    ekrw ekrwVarH = agvz.a.h();
                    ekrwVarH.X(eksq.a, "BugleGemini");
                    ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/penpal/conversation/reauthenticate/PenpalReauthenticateHandlerImpl$launchRecoveryDialog$1", "invokeSuspend$lambda$1", 178, "PenpalReauthenticateHandlerImpl.kt")).q("Launching auth recovery dialog");
                    agvzVar2.f.c("Bugle.Penpal.UI.Reauthenticate.Confirm");
                    try {
                        lci lciVar3 = new lci() { // from class: kxq
                            @Override // defpackage.lci
                            public final /* synthetic */ lci a(lci lciVar4) {
                                return new lch(this, lciVar4);
                            }

                            @Override // defpackage.lci
                            public final boolean b(Object obj2) {
                                return false;
                            }
                        };
                        lci lciVar4 = new lci() { // from class: kxr
                            @Override // defpackage.lci
                            public final /* synthetic */ lci a(lci lciVar5) {
                                return new lch(this, lciVar5);
                            }

                            @Override // defpackage.lci
                            public final boolean b(Object obj2) {
                                return false;
                            }
                        };
                        lci lciVar5 = new lci() { // from class: kxs
                            @Override // defpackage.lci
                            public final /* synthetic */ lci a(lci lciVar6) {
                                return new lch(this, lciVar6);
                            }

                            @Override // defpackage.lci
                            public final boolean b(Object obj2) {
                                return false;
                            }
                        };
                        lci lciVar6 = new lci() { // from class: kxt
                            @Override // defpackage.lci
                            public final /* synthetic */ lci a(lci lciVar7) {
                                return new lch(this, lciVar7);
                            }

                            @Override // defpackage.lci
                            public final boolean b(Object obj2) {
                                return false;
                            }
                        };
                        lci lciVar7 = new lci() { // from class: kxu
                            @Override // defpackage.lci
                            public final /* synthetic */ lci a(lci lciVar8) {
                                return new lch(this, lciVar8);
                            }

                            @Override // defpackage.lci
                            public final boolean b(Object obj2) {
                                return false;
                            }
                        };
                        HashMap map = new HashMap();
                        lci lciVar8 = new lci() { // from class: kxv
                            @Override // defpackage.lci
                            public final /* synthetic */ lci a(lci lciVar9) {
                                return new lch(this, lciVar9);
                            }

                            @Override // defpackage.lci
                            public final boolean b(Object obj2) {
                                return false;
                            }
                        };
                        lci lciVar9 = new lci() { // from class: kxw
                            @Override // defpackage.lci
                            public final /* synthetic */ lci a(lci lciVar10) {
                                return new lch(this, lciVar10);
                            }

                            @Override // defpackage.lci
                            public final boolean b(Object obj2) {
                                return false;
                            }
                        };
                        lci lciVar10 = new lci() { // from class: kxo
                            @Override // defpackage.lci
                            public final /* synthetic */ lci a(lci lciVar11) {
                                return new lch(this, lciVar11);
                            }

                            @Override // defpackage.lci
                            public final boolean b(Object obj2) {
                                return true;
                            }
                        };
                        eiehVar2 = eiehVarA;
                        try {
                            try {
                                str = "invokeSuspend$lambda$1";
                            } catch (Exception e) {
                                e = e;
                                str = "invokeSuspend$lambda$1";
                            }
                            try {
                                lchVar = new lch(lciVar7, new lci() { // from class: kxn
                                    public final /* synthetic */ String a = "com.google.android.gms";

                                    @Override // defpackage.lci
                                    public final /* synthetic */ lci a(lci lciVar11) {
                                        return new lch(this, lciVar11);
                                    }

                                    @Override // defpackage.lci
                                    public final boolean b(Object obj2) {
                                        return this.a.equals((String) obj2);
                                    }
                                });
                                lchVar2 = new lch(lciVar3, new lci() { // from class: agvb
                                    @Override // defpackage.lci
                                    public final /* synthetic */ lci a(lci lciVar11) {
                                        return new lch(this, lciVar11);
                                    }

                                    @Override // defpackage.lci
                                    public final boolean b(Object obj2) {
                                        String str3 = (String) obj2;
                                        ekrg ekrgVar = agvz.a;
                                        str3.getClass();
                                        return fdgn.t(str3, "com.google.android.gms");
                                    }
                                });
                                lchVar3 = new lch(lciVar4, new lci() { // from class: agvc
                                    @Override // defpackage.lci
                                    public final /* synthetic */ lci a(lci lciVar11) {
                                        return new lch(this, lciVar11);
                                    }

                                    @Override // defpackage.lci
                                    public final boolean b(Object obj2) {
                                        String host;
                                        Uri uri2 = (Uri) obj2;
                                        ekrg ekrgVar = agvz.a;
                                        return fdbq.f(uri2.getScheme(), "intent") && (host = uri2.getHost()) != null && fdgn.t(host, "com.google.android.gms");
                                    }
                                });
                                lciVar = new lci() { // from class: agvd
                                    @Override // defpackage.lci
                                    public final /* synthetic */ lci a(lci lciVar11) {
                                        return new lch(this, lciVar11);
                                    }

                                    @Override // defpackage.lci
                                    public final boolean b(Object obj2) {
                                        ekrg ekrgVar = agvz.a;
                                        return true;
                                    }
                                };
                                lciVar2 = (lci) map.get(GroupManagementRequest.TARGET_ATTRIBUTE);
                                if (lciVar2 == null) {
                                    lciVar2 = new lci() { // from class: kxp
                                        @Override // defpackage.lci
                                        public final /* synthetic */ lci a(lci lciVar11) {
                                            return new lch(this, lciVar11);
                                        }

                                        @Override // defpackage.lci
                                        public final boolean b(Object obj2) {
                                            return false;
                                        }
                                    };
                                }
                                str2 = "com/google/android/apps/messaging/penpal/conversation/reauthenticate/PenpalReauthenticateHandlerImpl$launchRecoveryDialog$1";
                            } catch (Exception e2) {
                                e = e2;
                                str2 = "com/google/android/apps/messaging/penpal/conversation/reauthenticate/PenpalReauthenticateHandlerImpl$launchRecoveryDialog$1";
                                try {
                                    ekrw ekrwVarI = agvz.a.i();
                                    ekrwVarI.X(eksq.a, "BugleGemini");
                                    ((ekrd) ((ekrd) ekrwVarI).g(e).h(str2, str, 187, "PenpalReauthenticateHandlerImpl.kt")).q("Exception while navigating to framework login dialog");
                                    agvzVar2.h.h(agbl.a);
                                    fczl.a(eiehVar2, null);
                                    return fctx.a;
                                } catch (Throwable th2) {
                                    th = th2;
                                    eiehVar = eiehVar2;
                                    th = th;
                                    try {
                                        throw th;
                                    } catch (Throwable th3) {
                                        fczl.a(eiehVar, th);
                                        throw th3;
                                    }
                                }
                            }
                            try {
                                map.put(GroupManagementRequest.TARGET_ATTRIBUTE, lciVar2.a(lciVar));
                                Intent intent = agvfVar2.a;
                                lbz lbzVar = new lbz() { // from class: kxm
                                    @Override // defpackage.lbz
                                    public final void accept(Object obj2) {
                                        throw new SecurityException((String) obj2);
                                    }
                                };
                                Intent intent2 = new Intent();
                                ComponentName component = intent.getComponent();
                                if (component != null) {
                                    lciVar10.b(component);
                                }
                                intent2.setComponent(component);
                                String str3 = intent.getPackage();
                                if (str3 == null || lchVar.b(str3)) {
                                    intent2.setPackage(str3);
                                } else {
                                    lbzVar.accept("Package is not allowed: ".concat(str3));
                                }
                                if (intent.getFlags() == 0) {
                                    intent2.setFlags(intent.getFlags());
                                } else {
                                    intent.getFlags();
                                    intent2.setFlags(0);
                                    lbzVar.accept("The intent contains flags that are not allowed: 0x".concat(String.valueOf(Integer.toHexString(intent.getFlags()))));
                                }
                                String action = intent.getAction();
                                if (action == null || lchVar2.b(action)) {
                                    intent2.setAction(action);
                                } else {
                                    lbzVar.accept("Action is not allowed: ".concat(action));
                                }
                                Uri data = intent.getData();
                                if (data == null || lchVar3.b(data)) {
                                    intent2.setData(data);
                                } else {
                                    Objects.toString(data);
                                    lbzVar.accept("Data is not allowed: ".concat(data.toString()));
                                }
                                String type = intent.getType();
                                if (type != null) {
                                    lciVar5.b(type);
                                    lbzVar.accept("Type is not allowed: ".concat(type));
                                } else {
                                    intent2.setDataAndType(intent2.getData(), null);
                                }
                                Set<String> categories = intent.getCategories();
                                if (categories != null) {
                                    for (String str4 : categories) {
                                        lciVar6.b(str4);
                                        lbzVar.accept("Category is not allowed: ".concat(String.valueOf(str4)));
                                    }
                                }
                                Bundle extras = intent.getExtras();
                                if (extras != null) {
                                    for (String str5 : extras.keySet()) {
                                        if (str5.equals("android.intent.extra.STREAM")) {
                                            lbzVar.accept("Allowing Extra Stream requires also allowing at least  FLAG_GRANT_READ_URI_PERMISSION Flag.");
                                        } else if (str5.equals("output")) {
                                            lbzVar.accept("Allowing Extra Output requires also allowing FLAG_GRANT_READ_URI_PERMISSION and FLAG_GRANT_WRITE_URI_PERMISSION Flags.");
                                        } else {
                                            Object obj2 = extras.get(str5);
                                            lci lciVar11 = (lci) map.get(str5);
                                            if (lciVar11 == null || !lciVar11.b(obj2)) {
                                                lbzVar.accept(a.m(obj2, str5, "Extra is not allowed. Key: ", ". Value: "));
                                            } else if (obj2 == null) {
                                                intent2.getExtras().putString(str5, null);
                                            } else if (obj2 instanceof Parcelable) {
                                                intent2.putExtra(str5, (Parcelable) obj2);
                                            } else if (obj2 instanceof Parcelable[]) {
                                                intent2.putExtra(str5, (Parcelable[]) obj2);
                                            } else {
                                                if (!(obj2 instanceof Serializable)) {
                                                    Class<?> cls = obj2.getClass();
                                                    Objects.toString(cls);
                                                    throw new IllegalArgumentException("Unsupported type ".concat(String.valueOf(cls)));
                                                }
                                                intent2.putExtra(str5, (Serializable) obj2);
                                            }
                                        }
                                    }
                                }
                                ClipData clipData = intent.getClipData();
                                if (clipData != null) {
                                    lciVar9.b(clipData);
                                    ClipData clipData2 = null;
                                    for (int i = 0; i < clipData.getItemCount(); i++) {
                                        ClipData.Item itemAt = clipData.getItemAt(i);
                                        if (Build.VERSION.SDK_INT >= 31) {
                                            if (itemAt.getHtmlText() != null || itemAt.getIntent() != null || itemAt.getTextLinks() != null) {
                                                lbzVar.accept(a.y(itemAt, i, "ClipData item at position ", " contains htmlText, textLinks or intent: "));
                                            }
                                        } else if (itemAt.getHtmlText() != null || itemAt.getIntent() != null) {
                                            lbzVar.accept(a.y(itemAt, i, "ClipData item at position ", " contains htmlText, textLinks or intent: "));
                                        }
                                        if (itemAt.getText() != null) {
                                            lbzVar.accept("Item text cannot contain value. Item position: " + i + ". Text: " + ((Object) itemAt.getText()));
                                        }
                                        if (itemAt.getUri() != null) {
                                            lciVar8.b(itemAt.getUri());
                                            lbzVar.accept("Item URI is not allowed. Item position: " + i + ". URI: " + itemAt.getUri());
                                            uri = null;
                                        } else {
                                            uri = itemAt.getUri();
                                        }
                                        if (uri != null) {
                                            if (clipData2 == null) {
                                                clipData2 = new ClipData(clipData.getDescription(), new ClipData.Item(null, null, uri));
                                            } else {
                                                clipData2.addItem(new ClipData.Item(null, null, uri));
                                            }
                                        }
                                    }
                                    if (clipData2 != null) {
                                        intent2.setClipData(clipData2);
                                    }
                                }
                                if (Build.VERSION.SDK_INT >= 29 && intent.getIdentifier() != null) {
                                    lbzVar.accept("Identifier is not allowed: ".concat(String.valueOf(intent.getIdentifier())));
                                }
                                if (intent.getSelector() != null) {
                                    Intent selector = intent.getSelector();
                                    Objects.toString(selector);
                                    lbzVar.accept("Selector is not allowed: ".concat(String.valueOf(selector)));
                                }
                                if (intent.getSourceBounds() != null) {
                                    Rect sourceBounds = intent.getSourceBounds();
                                    Objects.toString(sourceBounds);
                                    lbzVar.accept("SourceBounds is not allowed: ".concat(String.valueOf(sourceBounds)));
                                }
                                intent2.setFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
                                eiid.o(agvzVar2.c, intent2);
                            } catch (Exception e3) {
                                e = e3;
                                ekrw ekrwVarI2 = agvz.a.i();
                                ekrwVarI2.X(eksq.a, "BugleGemini");
                                ((ekrd) ((ekrd) ekrwVarI2).g(e).h(str2, str, 187, "PenpalReauthenticateHandlerImpl.kt")).q("Exception while navigating to framework login dialog");
                                agvzVar2.h.h(agbl.a);
                                fczl.a(eiehVar2, null);
                                return fctx.a;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            th = th;
                            eiehVar = eiehVar2;
                            throw th;
                        }
                    } catch (Exception e4) {
                        e = e4;
                        str = "invokeSuspend$lambda$1";
                        str2 = "com/google/android/apps/messaging/penpal/conversation/reauthenticate/PenpalReauthenticateHandlerImpl$launchRecoveryDialog$1";
                        eiehVar2 = eiehVarA;
                    } catch (Throwable th5) {
                        th = th5;
                        eiehVar2 = eiehVarA;
                    }
                    fczl.a(eiehVar2, null);
                    return fctx.a;
                } catch (Throwable th6) {
                    th = th6;
                    eiehVar = eiehVarA;
                }
            }
        });
        String string4 = context.getString(R.string.penpal_auth_dialog_cancel);
        string4.getClass();
        agvzVar.k.c(new djmj(string2, null, null, string, false, false, dktqVar, new dktq(string4, new fdae() { // from class: agvk
            @Override // defpackage.fdae
            public final Object invoke() {
                ekrw ekrwVarE = agvz.a.e();
                ekrwVarE.X(eksq.a, "BugleGemini");
                ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/penpal/conversation/reauthenticate/PenpalReauthenticateHandlerImpl$launchRecoveryDialog$1", "invokeSuspend$lambda$2", 196, "PenpalReauthenticateHandlerImpl.kt")).q("Closing relogin dialog due to user dismiss, exiting Penpal conversation");
                agvz agvzVar2 = agvzVar;
                agvzVar2.f.c("Bugle.Penpal.UI.Reauthenticate.Decline");
                agvzVar2.h.h(agbl.a);
                return fctx.a;
            }
        }), null, 310), false);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new agvl(this.a, this.b, fcxyVar);
    }
}
