package defpackage;

import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.usage.UsageStatsManager;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ContentProviderOperation;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.OperationApplicationException;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.provider.ContactsContract;
import android.provider.Telephony;
import android.telephony.ServiceState;
import android.telephony.SmsMessage;
import android.telephony.TelephonyManager;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.Base64;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.car.app.model.Alert;
import com.google.android.apps.messaging.backup.g1.GoogleOneRestoreService;
import com.google.android.apps.messaging.diagnostics.LogTelephonyDatabaseAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;
import com.google.android.apps.messaging.ui.debug.database.DatabaseActivity;
import com.google.android.ims.provisioning.config.Configuration;
import com.google.android.ims.rcsservice.chatsession.ChatSessionReportEvent;
import com.google.android.ims.util.common.RcsIntents;
import com.google.android.rcs.client.profile.RcsProfileService;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.iid.FirebaseInstanceId;
import j$.lang.Iterable$EL;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Comparator;
import j$.util.DesugarTimeZone;
import j$.util.Optional;
import j$.util.function.BiFunction$CC;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collector;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.StreamCorruptedException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.chromium.net.CronetEngine;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxsa implements cxcb {
    private static final ejxr bm = cdag.v("enable_stuck_messages_notification_in_debug_menu");
    public static final ekrg c = ekrg.c("com/google/android/apps/messaging/ui/debug/DebugUtilsImpl");
    public static final brsv[] d;
    public final fcsu A;
    public final fcsu B;
    public final fcsu C;
    public final fcsu D;
    public final fcsu E;
    public final fcsu F;
    public final fcsu G;
    public final fcsu H;
    public final eosc I;
    public final eygg J;
    public final fcsu K;
    public final fcsu L;
    public final fcsu M;
    public final fcsu N;
    public final fcsu O;
    public final fcsu P;
    public final fcsu Q;
    public final fcsu R;
    public final fcsu S;
    public final fcsu T;
    public final fcsu U;
    public final fcsu V;
    public final fcsu W;
    public final fcsu X;
    public final fcsu Y;
    public final fcsu Z;
    public final fcsu aA;
    public final fcsu aB;
    public final fcsu aC;
    public final fcsu aD;
    public final fcsu aE;
    public final fcsu aF;
    public final fcsu aG;
    public final fcsu aH;
    public final fcsu aI;
    public final fcsu aJ;
    public final fcsu aK;
    public final fcsu aL;
    public final fcsu aM;
    public final fcsu aN;
    public final fcsu aO;
    public final fcsu aP;
    public int aQ;
    public final eosc aR;
    public final fcsu aS;
    public final fcsu aT;
    public final fcsu aU;
    public final fcsu aV;
    public final fcsu aW;
    public final fcsu aX;
    public final fcsu aY;
    public final fcsu aZ;
    public final fcsu aa;
    public final fcsu ab;
    public final fcsu ac;
    public final fcsu ad;
    public final eosd ae;
    public final eosd af;
    public final fcsu ag;
    public final fcsu ah;
    public final ckhg ai;
    public final fcsu aj;
    public final fcsu ak;
    public final fcsu al;
    public final fcsu am;
    public final cxah an;
    public final fcsu ao;
    public final fcsu ap;
    public final fcsu aq;
    public final fcsu ar;
    public final cmfo as;
    public final fcsu at;
    public final fcsu au;
    public final fcsu av;
    public final fcsu aw;
    public final fcsu ax;
    public final fcsu ay;
    public final fcsu az;
    private final fcsu bA;
    private final fcsu bB;
    private final fcsu bC;
    public final fcsu ba;
    public final fcsu bb;
    public final fcsu bc;
    public final fcsu bd;
    public final fcsu be;
    public final fcsu bf;
    public final Optional bg;
    public final fcsu bh;
    public final fcsu bi;
    public final fcsu bj;
    public final fcsu bk;
    public final fcsu bl;
    private final fcsu bn;
    private final fcsu bo;
    private final fcsu bp;
    private final fcsu bq;
    private final fcsu br;
    private final fcsu bs;
    private final fcsu bt;
    private final fcsu bu;
    private final List bv = new ArrayList();
    private final fcsu bw;
    private final fcsu bx;
    private final fcsu by;
    private final fcsu bz;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    public final fcsu h;
    public final fcsu i;
    public final fcsu j;
    public final fcsu k;
    public final cogw l;
    public final fcsu m;
    public final fcsu n;
    public final fcsu o;
    public final eygg p;
    public final fcsu q;
    public final fcsu r;
    public final fcsu s;
    public final fcsu t;
    public final fcsu u;
    public final fcsu v;
    public final fcsu w;
    public final Context x;
    public final fcsu y;
    public final fcsu z;

    static {
        brsu brsuVar = brvd.c;
        d = new brsv[]{brsuVar.a, brsuVar.b, brsuVar.c, brsuVar.d, brsuVar.i, brsuVar.j, brsuVar.k, brsuVar.p, brsuVar.R};
    }

    public cxsa(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, cogw cogwVar, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, eygg eyggVar, fcsu fcsuVar11, fcsu fcsuVar12, fcsu fcsuVar13, fcsu fcsuVar14, fcsu fcsuVar15, fcsu fcsuVar16, fcsu fcsuVar17, Context context, fcsu fcsuVar18, fcsu fcsuVar19, fcsu fcsuVar20, fcsu fcsuVar21, fcsu fcsuVar22, fcsu fcsuVar23, fcsu fcsuVar24, fcsu fcsuVar25, fcsu fcsuVar26, eosc eoscVar, eygg eyggVar2, fcsu fcsuVar27, fcsu fcsuVar28, fcsu fcsuVar29, fcsu fcsuVar30, fcsu fcsuVar31, fcsu fcsuVar32, fcsu fcsuVar33, fcsu fcsuVar34, fcsu fcsuVar35, fcsu fcsuVar36, fcsu fcsuVar37, fcsu fcsuVar38, fcsu fcsuVar39, fcsu fcsuVar40, fcsu fcsuVar41, fcsu fcsuVar42, fcsu fcsuVar43, fcsu fcsuVar44, fcsu fcsuVar45, fcsu fcsuVar46, fcsu fcsuVar47, eosd eosdVar, fcsu fcsuVar48, eosd eosdVar2, fcsu fcsuVar49, fcsu fcsuVar50, fcsu fcsuVar51, ckhg ckhgVar, fcsu fcsuVar52, fcsu fcsuVar53, fcsu fcsuVar54, fcsu fcsuVar55, cxah cxahVar, fcsu fcsuVar56, fcsu fcsuVar57, fcsu fcsuVar58, fcsu fcsuVar59, fcsu fcsuVar60, fcsu fcsuVar61, fcsu fcsuVar62, fcsu fcsuVar63, fcsu fcsuVar64, fcsu fcsuVar65, fcsu fcsuVar66, fcsu fcsuVar67, fcsu fcsuVar68, fcsu fcsuVar69, fcsu fcsuVar70, fcsu fcsuVar71, fcsu fcsuVar72, eosc eoscVar2, fcsu fcsuVar73, fcsu fcsuVar74, fcsu fcsuVar75, fcsu fcsuVar76, fcsu fcsuVar77, fcsu fcsuVar78, fcsu fcsuVar79, fcsu fcsuVar80, fcsu fcsuVar81, fcsu fcsuVar82, fcsu fcsuVar83, fcsu fcsuVar84, fcsu fcsuVar85, fcsu fcsuVar86, fcsu fcsuVar87, fcsu fcsuVar88, fcsu fcsuVar89, fcsu fcsuVar90, fcsu fcsuVar91, fcsu fcsuVar92, fcsu fcsuVar93, fcsu fcsuVar94, fcsu fcsuVar95, fcsu fcsuVar96, fcsu fcsuVar97, fcsu fcsuVar98, fcsu fcsuVar99, fcsu fcsuVar100, fcsu fcsuVar101, fcsu fcsuVar102, fcsu fcsuVar103, fcsu fcsuVar104, fcsu fcsuVar105, fcsu fcsuVar106, fcsu fcsuVar107, Optional optional, fcsu fcsuVar108, fcsu fcsuVar109, fcsu fcsuVar110, fcsu fcsuVar111, fcsu fcsuVar112, fcsu fcsuVar113, fcsu fcsuVar114, fcsu fcsuVar115) {
        this.e = fcsuVar;
        this.f = fcsuVar2;
        this.g = fcsuVar3;
        this.h = fcsuVar4;
        this.i = fcsuVar5;
        this.j = fcsuVar6;
        this.k = fcsuVar7;
        this.l = cogwVar;
        this.m = fcsuVar8;
        this.n = fcsuVar9;
        this.o = fcsuVar10;
        this.p = eyggVar;
        this.q = fcsuVar11;
        this.r = fcsuVar12;
        this.s = fcsuVar13;
        this.t = fcsuVar14;
        this.u = fcsuVar15;
        this.v = fcsuVar16;
        this.w = fcsuVar17;
        this.x = context;
        this.y = fcsuVar18;
        this.z = fcsuVar19;
        this.A = fcsuVar20;
        this.B = fcsuVar21;
        this.C = fcsuVar22;
        this.D = fcsuVar23;
        this.E = fcsuVar24;
        this.F = fcsuVar25;
        this.G = fcsuVar26;
        this.J = eyggVar2;
        this.H = fcsuVar27;
        this.I = eoscVar;
        this.K = fcsuVar28;
        this.L = fcsuVar29;
        this.M = fcsuVar30;
        this.N = fcsuVar31;
        this.O = fcsuVar32;
        this.P = fcsuVar33;
        this.Q = fcsuVar34;
        this.R = fcsuVar35;
        this.S = fcsuVar36;
        this.T = fcsuVar37;
        this.U = fcsuVar38;
        this.V = fcsuVar39;
        this.W = fcsuVar40;
        this.X = fcsuVar41;
        this.Y = fcsuVar42;
        this.Z = fcsuVar43;
        this.aa = fcsuVar44;
        this.ab = fcsuVar45;
        this.ac = fcsuVar46;
        this.ad = fcsuVar47;
        this.ae = eosdVar;
        this.bn = fcsuVar48;
        this.af = eosdVar2;
        this.ag = fcsuVar49;
        this.ah = fcsuVar50;
        this.bo = fcsuVar51;
        this.ai = ckhgVar;
        this.aj = fcsuVar52;
        this.ak = fcsuVar53;
        this.al = fcsuVar54;
        this.am = fcsuVar55;
        this.an = cxahVar;
        this.ao = fcsuVar56;
        this.bp = fcsuVar57;
        this.ap = fcsuVar58;
        this.bq = fcsuVar59;
        this.aq = fcsuVar60;
        this.ar = fcsuVar61;
        cmgk cmgkVar = (cmgk) fcsuVar62.b();
        cmgg cmggVarC = cmgh.c();
        cmggVarC.d(cmfn.REACTIONS_PROMO_DATA);
        cmggVarC.f(umq.a);
        this.as = cmgkVar.a(cmggVarC.a());
        this.at = fcsuVar63;
        this.au = fcsuVar64;
        this.br = fcsuVar65;
        this.bs = fcsuVar66;
        this.av = fcsuVar67;
        this.aw = fcsuVar68;
        this.ax = fcsuVar69;
        this.ay = fcsuVar70;
        this.az = fcsuVar71;
        this.aA = fcsuVar72;
        this.aR = eoscVar2;
        this.aB = fcsuVar73;
        this.aC = fcsuVar74;
        this.aD = fcsuVar75;
        this.bt = fcsuVar76;
        this.aS = fcsuVar77;
        this.aG = fcsuVar78;
        this.bu = fcsuVar79;
        this.aE = fcsuVar80;
        this.aF = fcsuVar81;
        this.aT = fcsuVar82;
        this.aU = fcsuVar83;
        this.aH = fcsuVar85;
        this.aI = fcsuVar86;
        this.aJ = fcsuVar87;
        this.aK = fcsuVar88;
        this.aL = fcsuVar84;
        this.aV = fcsuVar89;
        this.aW = fcsuVar90;
        this.aM = fcsuVar91;
        this.aX = fcsuVar92;
        this.aP = fcsuVar93;
        this.aY = fcsuVar94;
        this.ba = fcsuVar95;
        this.bb = fcsuVar96;
        this.bw = fcsuVar97;
        this.bc = fcsuVar98;
        this.bx = fcsuVar99;
        this.bd = fcsuVar100;
        this.be = fcsuVar101;
        this.by = fcsuVar102;
        this.bf = fcsuVar103;
        this.aN = fcsuVar104;
        this.aO = fcsuVar105;
        this.bz = fcsuVar106;
        this.bg = optional;
        this.bh = fcsuVar108;
        this.aZ = fcsuVar107;
        this.bA = fcsuVar109;
        this.bi = fcsuVar110;
        this.bj = fcsuVar111;
        this.bB = fcsuVar112;
        this.bk = fcsuVar113;
        this.bC = fcsuVar114;
        this.bl = fcsuVar115;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [alqm, java.lang.Object] */
    static final String A(crof crofVar) {
        Optional optionalI = crofVar.i(false);
        return optionalI.isEmpty() ? "" : ejwk.b(optionalI.get().h());
    }

    public static ConversationIdType f() {
        botb botbVarE = botm.e();
        botbVarE.A("getLastRcsOneToOneConversationId");
        botbVarE.i(new Function() { // from class: cxkc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                botl botlVar = (botl) obj;
                ekrg ekrgVar = cxsa.c;
                botlVar.K();
                botlVar.j(0);
                return botlVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        botbVarE.e(new bosy(botm.c.r, false));
        botbVarE.y(1);
        botbVarE.g(new Function() { // from class: cxkd
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ekrg ekrgVar = cxsa.c;
                return ((bopp) obj).a;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bopr boprVar = (bopr) botbVarE.b().p();
        try {
            ConversationIdType conversationIdTypeH = boprVar.moveToFirst() ? boprVar.h() : barn.a;
            boprVar.close();
            return conversationIdTypeH;
        } catch (Throwable th) {
            try {
                boprVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void j(cyfv cyfvVar, String str, CharSequence charSequence, String str2, String str3) {
        adin.a(cyfvVar.a, new adjv(str, charSequence, str2, str3, null, null));
    }

    public static void l(ahto ahtoVar, StringBuilder sb) {
        sb.append(Base64.encodeToString(cobs.d(ahtoVar.a), 2));
        sb.append("\n  [");
        sb.append(ahtoVar.c.name());
        sb.append("]\n\n");
    }

    public static void n() {
        u(cqry.p);
        u(cqry.o);
        u(cqry.n);
        u(cqry.m);
        cczv cczvVar = cqry.d;
        Double dValueOf = Double.valueOf(0.0d);
        q(cczvVar, dValueOf);
        q(cqry.j, dValueOf);
        q(cqry.l, dValueOf);
        q(cqry.f, dValueOf);
        q(cqry.h, dValueOf);
    }

    public static void q(cczv cczvVar, Object obj) {
        cczvVar.k(obj);
    }

    public static void r(Activity activity) {
        if (activity instanceof iy) {
            activity.invalidateOptionsMenu();
        }
    }

    public static void u(cczv cczvVar) {
        cczvVar.m();
    }

    public final void B(int i, Activity activity, Optional optional, Optional optional2) {
        int i2;
        if (((cqjy) this.U.b()).q() && i - 3001 >= 0) {
            List list = this.bv;
            if (i2 < list.size()) {
                cxrw cxrwVar = (cxrw) list.get(i2);
                cxrwVar.a(cyfw.a(activity, optional, optional2));
            }
        }
    }

    @Override // defpackage.cxcb
    public final SmsMessage[] a(String str) throws Throwable {
        DataInputStream dataInputStream;
        SmsMessage[] smsMessageArr = new SmsMessage[0];
        DataInputStream dataInputStream2 = null;
        try {
            dataInputStream = new DataInputStream(new FileInputStream(((cqjy) this.U.b()).a(str, false, this.x)));
        } catch (FileNotFoundException unused) {
        } catch (StreamCorruptedException unused2) {
        } catch (IOException unused3) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (dataInputStream.readInt() > 0) {
                dataInputStream.readUTF();
            }
            int i = dataInputStream.readInt();
            SmsMessage[] smsMessageArr2 = new SmsMessage[i];
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = dataInputStream.readInt();
                byte[] bArr = new byte[i3];
                dataInputStream.read(bArr, 0, i3);
                smsMessageArr2[i2] = SmsMessage.createFromPdu(bArr);
            }
            try {
                dataInputStream.close();
            } catch (IOException unused4) {
            }
            return smsMessageArr2;
        } catch (FileNotFoundException unused5) {
            dataInputStream2 = dataInputStream;
            if (dataInputStream2 == null) {
                return smsMessageArr;
            }
            try {
                dataInputStream2.close();
                return smsMessageArr;
            } catch (IOException unused6) {
                return smsMessageArr;
            }
        } catch (StreamCorruptedException unused7) {
            dataInputStream2 = dataInputStream;
            if (dataInputStream2 == null) {
                return smsMessageArr;
            }
            dataInputStream2.close();
            return smsMessageArr;
        } catch (IOException unused8) {
            dataInputStream2 = dataInputStream;
            if (dataInputStream2 == null) {
                return smsMessageArr;
            }
            dataInputStream2.close();
            return smsMessageArr;
        } catch (Throwable th2) {
            dataInputStream2 = dataInputStream;
            th = th2;
            if (dataInputStream2 != null) {
                try {
                    dataInputStream2.close();
                } catch (IOException unused9) {
                }
            }
            throw th;
        }
    }

    @Override // defpackage.cxcb
    public final void b(int i, Activity activity, Optional optional) {
        B(i, activity, optional, b);
    }

    @Override // defpackage.cxcb
    public final void c(Menu menu) {
        d(menu, Optional.empty());
    }

    @Override // defpackage.cxcb
    public final void d(final Menu menu, final Optional optional) {
        this.bv.clear();
        Iterator it = ((Set) ((eyig) this.bz).a).iterator();
        while (it.hasNext()) {
            Iterator it2 = ((cyfy) it.next()).a().a().iterator();
            if (it2.hasNext()) {
                throw null;
            }
        }
        if (((aqmj) this.by.b()).a()) {
            k(menu, "Database", new cxrw() { // from class: cxpg
                @Override // defpackage.cxrw
                public final void a(cyfv cyfvVar) throws IOException {
                    ekrg ekrgVar = cxsa.c;
                    Activity activity = cyfvVar.a;
                    eiid.o(activity, aiiw.c(activity, DatabaseActivity.class, "android.intent.action.VIEW").a());
                }
            }, optional);
        }
        boolean z = ((abtz) this.aT.b()).b;
        optional.ifPresent(new Consumer() { // from class: cxgg
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                final Activity activity = (Activity) obj;
                Optional optional2 = (Optional) this.a.al.b();
                final Menu menu2 = menu;
                optional2.ifPresent(new Consumer() { // from class: cxqu
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj2) {
                        ekrg ekrgVar = cxsa.c;
                        ((cxuq) obj2).a(menu2, activity);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        optional.ifPresent(new Consumer() { // from class: cxhd
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                final Activity activity = (Activity) obj;
                Optional optional2 = (Optional) this.a.aC.b();
                final Menu menu2 = menu;
                optional2.ifPresent(new Consumer() { // from class: cxmx
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj2) {
                        ekrg ekrgVar = cxsa.c;
                        ((cykn) obj2).a(menu2, activity);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        SubMenu subMenuAddSubMenu = menu.addSubMenu("RCS");
        k(subMenuAddSubMenu, "Configure MobileConfiguration", new cxrw() { // from class: cxhp
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                ((aijh) this.a.u.b()).O(cyfvVar.a);
            }
        }, optional);
        k(subMenuAddSubMenu, "Report RCS Connection State", new cxrw() { // from class: cxib
            @Override // defpackage.cxrw
            public final void a(final cyfv cyfvVar) {
                String rcsConfigAcsUrl;
                eiju eijuVarE;
                final cxsa cxsaVar = this.a;
                try {
                    RcsProfileService rcsProfileService = (RcsProfileService) cxsaVar.F.b();
                    rcsConfigAcsUrl = rcsProfileService.isConnected() ? rcsProfileService.getRcsConfigAcsUrl() : "[not connected]";
                } catch (efao e) {
                    ekrw ekrwVarJ = cxsa.c.j();
                    ekrwVarJ.X(eksq.a, "Bugle");
                    ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(e)).h("com/google/android/apps/messaging/ui/debug/DebugUtilsImpl", "getFullRcsStatus", (char) 5730, "DebugUtilsImpl.java")).q("Failed to retrieve getRcsConfigAcsUrl");
                    rcsConfigAcsUrl = "[exception]";
                }
                final int iE = cxsaVar.e();
                StringBuilder sb = new StringBuilder(250);
                sb.append(((cjpo) cxsaVar.aj.b()).g());
                sb.append("\nTransport: ");
                Set setG = ((cozg) cxsaVar.aq.b()).g();
                if (setG.size() > 1) {
                    sb.append((String) Collection.EL.stream(setG).map(new Function() { // from class: cxml
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            ekrg ekrgVar = cxsa.c;
                            return ((coze) obj).g;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).collect(Collectors.joining(", ")));
                } else {
                    sb.append(((coze) Collection.EL.stream(setG).findFirst().orElse(coze.a)).g);
                }
                sb.append("\nACS url: ");
                sb.append(rcsConfigAcsUrl);
                sb.append("\nPCSCF: ");
                sb.append(((ajhd) cxsaVar.r.b()).j(Optional.of(Integer.valueOf(iE))));
                sb.append("\nSub Id: ");
                sb.append(iE);
                crof crofVarH = cxsaVar.h(iE);
                if (crofVarH == null) {
                    eijuVarE = eijx.e(sb.toString());
                } else {
                    sb.append("\nSIM Slot: ");
                    sb.append(crofVarH.d() + 1);
                    sb.append("\nSIM Carrier: ");
                    sb.append(String.valueOf(crofVarH.l()));
                    sb.append("\nSIM Number: ");
                    sb.append(cxsa.A(crofVarH));
                    Context context = cxsaVar.x;
                    boolean zK = dhka.k(context);
                    sb.append("\nRcs Apk: ");
                    sb.append(true == zK ? "cs.apk" : "Bugle");
                    if (!zK) {
                        sb.append("\nRcs BOE: ");
                        sb.append(true != dhky.c(context) ? "Optimized" : "Exempted");
                        sb.append("\nGmsBinding: ");
                        sb.append(true != dhka.e(context) ? "Disabled" : "Enabled");
                        if (Build.VERSION.SDK_INT >= 28) {
                            UsageStatsManager usageStatsManager = (UsageStatsManager) context.getSystemService("usagestats");
                            String strValueOf = usageStatsManager == null ? "statsManager is null" : String.valueOf(usageStatsManager.getAppStandbyBucket());
                            sb.append("\nApp StandBy Bucket: ");
                            sb.append(strValueOf);
                            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
                            String strValueOf2 = activityManager == null ? "activityManager is null" : String.valueOf(activityManager.isBackgroundRestricted());
                            sb.append("\nBackground Restricted: ");
                            sb.append(strValueOf2);
                        }
                    }
                    fcsu fcsuVar = cxsaVar.ad;
                    if (((bvut) fcsuVar.b()).g()) {
                        final String string = sb.toString();
                        Callable callable = new Callable() { // from class: cxmm
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return ((cejp) cxsaVar.S.b()).d(iE);
                            }
                        };
                        eosd eosdVar = cxsaVar.af;
                        eiju eijuVarG = eijx.g(callable, eosdVar);
                        final bvut bvutVar = (bvut) fcsuVar.b();
                        bvutVar.getClass();
                        eijuVarE = eijuVarG.i(new eooz() { // from class: cxmn
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj) {
                                return bvutVar.e((String) obj);
                            }
                        }, eosdVar).i(new eooz() { // from class: cxmo
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj) {
                                ekrg ekrgVar = cxsa.c;
                                return eijx.e(string + "\nEtouffee provisioned: " + ((Boolean) obj));
                            }
                        }, eosdVar);
                    } else {
                        eijuVarE = eijx.e(sb.toString().concat("\nEtouffee: disabled"));
                    }
                }
                final Activity activity = cyfvVar.a;
                auvh.i(eijuVarE, new Consumer() { // from class: cxlf
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        String str = (String) obj;
                        ekrg ekrgVar = cxsa.c;
                        ((ClipboardManager) cyfvVar.a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("RCS Connection State", str));
                        new AlertDialog.Builder(activity).setTitle("RCS Connection State").setMessage(str).setCancelable(true).show();
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                }, cxsaVar.I);
            }
        }, optional);
        k(subMenuAddSubMenu, "Report Multi SIM RCS Connection State", new cxrw() { // from class: cxin
            @Override // defpackage.cxrw
            public final void a(final cyfv cyfvVar) {
                final StringBuilder sb = new StringBuilder(250);
                final cxsa cxsaVar = this.a;
                eiju eijuVarI = ((cmlb) cxsaVar.aD.b()).b().i(new eooz() { // from class: cxny
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        Iterator it3 = ((Set) obj).iterator();
                        while (true) {
                            StringBuilder sb2 = sb;
                            if (!it3.hasNext()) {
                                return eijx.e(sb2.toString());
                            }
                            cxsa cxsaVar2 = cxsaVar;
                            cmmh cmmhVar = (cmmh) ((cmlb) cxsaVar2.aD.b()).j((dggn) it3.next()).get();
                            dgiq dgiqVarF = ((dgrs) cxsaVar2.ap.b()).f(cmmhVar.c);
                            sb2.append("\nSIM ID: ");
                            sb2.append(cmmhVar.c);
                            sb2.append("\n\tRCS Connection State: ");
                            sb2.append(true != dgiqVarF.aa() ? "NOT AVAILABLE" : "CONNECTED");
                            sb2.append("\n\tTransport: ");
                            sb2.append(true != dgiqVarF.P() ? "Not Tachygram" : "Tachygram");
                            sb2.append("\n\tRCS State: ");
                            sb2.append(dgiqVarF.b());
                            sb2.append("\n\tRCS Config Version: ");
                            sb2.append(dgiqVarF.e());
                            sb2.append("\n\tSubId: ");
                            sb2.append(cmmhVar.d);
                            sb2.append("\n\tSim Slot: ");
                            sb2.append(cmmhVar.e);
                            sb2.append("\n\tSIM Operator: ");
                            sb2.append(cmmhVar.r);
                            sb2.append("\n\tSIM Phone Number: ");
                            sb2.append(cmmhVar.q);
                            sb2.append("\n");
                        }
                    }
                }, cxsaVar.aR);
                final Activity activity = cyfvVar.a;
                auvh.i(eijuVarI, new Consumer() { // from class: cxjs
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        String str = (String) obj;
                        ekrg ekrgVar = cxsa.c;
                        ((ClipboardManager) cyfvVar.a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Multi SIM RCS Connection State", str));
                        new AlertDialog.Builder(activity).setTitle("Multi SIM RCS Connection State").setMessage(str).setCancelable(true).show();
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                }, cxsaVar.I);
            }
        }, optional);
        fcsu fcsuVar = this.U;
        k(subMenuAddSubMenu, true != ((cqjy) fcsuVar.b()).p ? "Emulate RCS temp failure" : "Stop emulating RCS temp failure", new cxrw() { // from class: cxps
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                ((cqjy) this.a.U.b()).p = !((cqjy) r0.b()).p;
                cxsa.r(cyfvVar.a);
            }
        }, optional);
        k(subMenuAddSubMenu, true != ((cqjy) fcsuVar.b()).q ? "Emulate RCS perm failure" : "Stop emulating RCS perm failure", new cxrw() { // from class: cxqd
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                ((cqjy) this.a.U.b()).q = !((cqjy) r0.b()).q;
                cxsa.r(cyfvVar.a);
            }
        }, optional);
        k(subMenuAddSubMenu, "Show RCS success popup", new cxrw() { // from class: cxqo
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                final cxsa cxsaVar = this.a;
                try {
                    ((cmlb) cxsaVar.aD.b()).f().ifPresent(new Consumer() { // from class: cxjh
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void z(Object obj) {
                            final cmmh cmmhVar = (cmmh) obj;
                            final cxsa cxsaVar2 = cxsaVar;
                            eijx.f(new Runnable() { // from class: cxna
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ((cjxi) cxsaVar2.aI.b()).i(cmmhVar.c, cjxp.RCS_SUCCESS_NOTIFICATION_STATE_SUCCESS_AWAITING_NOTIFY);
                                }
                            }, cxsaVar2.aR).k(auvh.b(), eoqg.a);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                    ((egzh) cxsaVar.aG.b()).a(eijx.e(null), "POPUP_KEY");
                } catch (cmjj e) {
                    ekrw ekrwVarI = cxsa.c.i();
                    ekrwVarI.X(eksq.a, "Bugle");
                    ((ekrd) ((ekrd) ((ekrd) ekrwVarI).g(e)).h("com/google/android/apps/messaging/ui/debug/DebugUtilsImpl", "actionRcsProvisioningSuccess", (char) 3541, "DebugUtilsImpl.java")).q("failed to get default sim info");
                }
                Activity activity = cyfvVar.a;
                ekrw ekrwVarE = cxsa.c.e();
                ekrwVarE.X(eksq.a, "Bugle");
                ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/ui/debug/DebugUtilsImpl", "actionRcsProvisioningSuccess", 3543, "DebugUtilsImpl.java")).q("provision notification: debug queued rcs success popup");
                ((dfoa) dfpi.t().s()).a.g(true);
                activity.sendBroadcast(new Intent(RcsIntents.ACTION_NOTIFY_RECEIVED_RCS_SUCCESS_REQUEST));
            }
        }, optional);
        k(subMenuAddSubMenu, "Show Google Tos popup", new cxrw() { // from class: cxra
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                fcsu fcsuVar2 = this.a.q;
                ((crqv) fcsuVar2.b()).h("should_show_google_tos_prompt", true);
                ((crqv) fcsuVar2.b()).h("did_show_google_tos_prompt", false);
                ((crqv) fcsuVar2.b()).h("USER_ACCEPTED_UPSELL", false);
                cyfvVar.a.sendBroadcast(new Intent(RcsIntents.ACTION_NOTIFY_RECEIVED_GOOGLE_TOS_REQUEST));
            }
        }, optional);
        k(subMenuAddSubMenu, "Show Legal FYI", new cxrw() { // from class: cxci
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                cxsa cxsaVar = this.a;
                ((crqv) cxsaVar.q.b()).h("should_show_rcs_default_on_prompt", true);
                ((dgjq) cxsaVar.aU.b()).c(cjxn.a);
                cyfvVar.a.sendBroadcast(new Intent(RcsIntents.ACTION_NOTIFY_RECEIVED_LEGAL_FYI_REQUEST));
            }
        }, optional);
        k(subMenuAddSubMenu, "Show provisioning status log", new cxrw() { // from class: cxcu
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                new AlertDialog.Builder(cyfvVar.a).setTitle("Provisioning status log").setMessage(((chwq) this.a.w.b()).p()).setCancelable(true).show();
            }
        }, optional);
        k(subMenuAddSubMenu, true != ((cqjy) fcsuVar.b()).s ? "Emulate Ignoring RCS IMDN" : "Stop Ignoring RCS IMDN", new cxrw() { // from class: cxdg
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                ((cqjy) this.a.U.b()).s = !((cqjy) r0.b()).s;
                cxsa.r(cyfvVar.a);
            }
        }, optional);
        k(subMenuAddSubMenu, "Fail to deliver last incoming RCS message", new cxrw() { // from class: cxds
            @Override // defpackage.cxrw
            public final void a(final cyfv cyfvVar) {
                final cxsa cxsaVar = this.a;
                eijx.f(new Runnable() { // from class: cxkw
                    @Override // java.lang.Runnable
                    public final void run() {
                        basd basdVarR;
                        cyfv cyfvVar2 = cyfvVar;
                        cyfvVar2.b.isPresent();
                        final ConversationIdType conversationIdTypeF = cxsa.f();
                        boolean zB = conversationIdTypeF.b();
                        cxsa cxsaVar2 = cxsaVar;
                        if (zB) {
                            ((dakl) cxsaVar2.Y.b()).j("Failed to find 1:1 rcs conversation");
                            return;
                        }
                        brdr brdrVarD = MessagesTable.d();
                        brdrVarD.A("getLastReceivedRcsMessageId");
                        brdrVarD.f(new Function() { // from class: cxlz
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                ekrg ekrgVar = cxsa.c;
                                return ((bran) obj).C;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        brdrVarD.h(new Function() { // from class: cxma
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                brec brecVar = (brec) obj;
                                ekrg ekrgVar = cxsa.c;
                                brecVar.m(conversationIdTypeF);
                                brecVar.J(3);
                                brecVar.ae(100);
                                int[] iArr = {2, 3};
                                int iIntValue = MessagesTable.g().intValue();
                                if (iIntValue < 13020) {
                                    dqru.x("message_report_status", iIntValue);
                                }
                                brecVar.ap(new dqpm("messages.message_report_status", 3, brec.at(iArr), true));
                                return brecVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        brdrVarD.d(new brdo(MessagesTable.c.g, false));
                        brdrVarD.y(1);
                        brap brapVar = (brap) brdrVarD.b().p();
                        try {
                            if (brapVar.moveToFirst()) {
                                basdVarR = brapVar.r();
                                brapVar.close();
                            } else {
                                brapVar.close();
                                basdVarR = null;
                            }
                            if (basd.j(basdVarR)) {
                                ((dakl) cxsaVar2.Y.b()).j("Failed to find received rcs in conversation ".concat(conversationIdTypeF.toString()));
                                return;
                            }
                            ChatSessionReportEvent chatSessionReportEvent = new ChatSessionReportEvent(50071, basd.e(basdVarR), basd.e(basdVarR), 3);
                            Intent intent = new Intent(RcsIntents.ACTION_NEW_EVENT);
                            intent.putExtra(RcsIntents.EXTRA_EVENT, chatSessionReportEvent);
                            Activity activity = cyfvVar2.a;
                            dhff.c(activity, intent);
                            intent.setPackage("com.google.android.apps.messaging");
                            activity.sendBroadcast(intent);
                            ((dakl) cxsaVar2.Y.b()).j("Failed delivery report for Rcs Message " + basd.c(basdVarR) + " in conversation " + conversationIdTypeF.toString());
                        } catch (Throwable th) {
                            try {
                                brapVar.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                }, cxsaVar.af);
            }
        }, optional);
        SubMenu subMenuAddSubMenu2 = subMenuAddSubMenu.addSubMenu("Self-service messages");
        k(subMenuAddSubMenu2, "Request reconfiguration", new cxrw() { // from class: cxeq
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                this.a.m(ewfp.REQUEST_RECONFIGURATION);
            }
        }, optional);
        k(subMenuAddSubMenu2, "Send keep-alive", new cxrw() { // from class: cxey
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                this.a.m(ewfp.SEND_KEEPALIVE);
            }
        }, optional);
        k(subMenuAddSubMenu2, "Reset Provisioning Engine", new cxrw() { // from class: cxez
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                this.a.m(ewfp.RESET_PROVISIONING_ENGINE);
            }
        }, optional);
        k(subMenuAddSubMenu, "Force client to unregister", new cxrw() { // from class: cxfa
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                ((chwq) this.a.w.b()).s();
            }
        }, optional);
        k(subMenuAddSubMenu, "Schedule provisioning task for selected SIM", new cxrw() { // from class: cxfb
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                final cxsa cxsaVar = this.a;
                cxsaVar.w(cyfvVar.a, new Consumer() { // from class: cxio
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        cxsaVar.ai.k(((crof) obj).w(), enxe.DEBUG_UTILS);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
        }, optional);
        k(subMenuAddSubMenu, "Start RCS stack for selected SIM", new cxrw() { // from class: cxfc
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                this.a.x(true, cyfvVar);
            }
        }, optional);
        k(subMenuAddSubMenu, "Stop RCS stack for selected SIM", new cxrw() { // from class: cxfd
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                this.a.x(false, cyfvVar);
            }
        }, optional);
        k(subMenuAddSubMenu, "Invalidate RCS configuration for selected SIM", new cxrw() { // from class: cxfe
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                final cxsa cxsaVar = this.a;
                cxsaVar.w(cyfvVar.a, new Consumer() { // from class: cxjx
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        ((dgrs) cxsaVar.ap.b()).x(((crof) obj).w(), new Configuration());
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
        }, optional);
        k(subMenuAddSubMenu, "Show Phone Number Input activity for selected SIM", new cxrw() { // from class: cxff
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                final Activity activity = cyfvVar.a;
                final cxsa cxsaVar = this.a;
                cxsaVar.w(activity, new Consumer() { // from class: cxop
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        crof crofVar = (crof) obj;
                        cxsa cxsaVar2 = cxsaVar;
                        cjsd cjsdVar = (cjsd) cxsaVar2.au.b();
                        cjsdVar.a(crofVar.w(), cjsdVar.b(5, 3).build()).k(auvh.b(), cjsdVar.a);
                        ((aijh) cxsaVar2.u.b()).K(activity, crofVar.w(), 5);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
        }, optional);
        k(subMenuAddSubMenu, "Schedule Provisioning Task for All Eligible SIMs", new cxrw() { // from class: cxfg
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                ((ckhh) this.a.aS.b()).d(ewjm.TRIGGER_UNKNOWN, enxe.DEBUG_UTILS);
            }
        }, optional);
        k(subMenuAddSubMenu, "Cancel scheduled provisioning tasks", new cxrw() { // from class: cxfh
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                this.a.ai.a(enxe.DEBUG_UTILS).k(auvh.b(), eoqg.a);
            }
        }, optional);
        k(subMenuAddSubMenu, "Restart Provisioning Task", new cxrw() { // from class: cxfj
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                this.a.ai.c(enxe.DEBUG_UTILS).k(auvh.b(), eoqg.a);
            }
        }, optional);
        if (((aruh) this.bA.b()).a()) {
            k(subMenuAddSubMenu, "Schedule Config Refresh for All SIMs", new cxrw() { // from class: cxfk
                @Override // defpackage.cxrw
                public final void a(cyfv cyfvVar) {
                    ((ckhh) this.a.aS.b()).c();
                }
            }, optional);
        }
        k(subMenuAddSubMenu, "Invalidate all RCS configurations", new cxrw() { // from class: cxfl
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                final cxsa cxsaVar = this.a;
                ((cmlb) cxsaVar.aD.b()).b().h(new ejvr() { // from class: cxnk
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        Iterator it3 = ((Set) obj).iterator();
                        while (it3.hasNext()) {
                            ((dgrs) cxsaVar.ap.b()).x(dggo.a((dggn) it3.next()).a, new Configuration());
                        }
                        return null;
                    }
                }, cxsaVar.aR).k(auvh.b(), eoqg.a);
            }
        }, optional);
        if (cqbe.e()) {
            k(subMenuAddSubMenu, "Enter E2EE group multiplier", new cxrw() { // from class: cxfm
                @Override // defpackage.cxrw
                public final void a(cyfv cyfvVar) {
                    Activity activity = cyfvVar.a;
                    AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                    ScrollView scrollView = new ScrollView(activity);
                    LinearLayout linearLayout = new LinearLayout(activity);
                    scrollView.addView(linearLayout);
                    scrollView.setFillViewport(true);
                    linearLayout.setOrientation(1);
                    builder.setView(scrollView);
                    linearLayout.addView(cyfvVar.b("Enter multiplier:"));
                    final cxah cxahVar = this.a.an;
                    eygg eyggVar = cxahVar.e;
                    final EditText editTextA = cyfvVar.a(1);
                    editTextA.setHint(String.valueOf(((bvur) eyggVar.b()).s()));
                    linearLayout.addView(editTextA);
                    builder.setPositiveButton("Set", (DialogInterface.OnClickListener) null);
                    builder.setNegativeButton("Close", new DialogInterface.OnClickListener() { // from class: cxac
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                        }
                    });
                    AlertDialog alertDialogCreate = builder.create();
                    alertDialogCreate.setOnShowListener(new DialogInterface.OnShowListener() { // from class: cxad
                        @Override // android.content.DialogInterface.OnShowListener
                        public final void onShow(final DialogInterface dialogInterface) {
                            Button button = ((AlertDialog) dialogInterface).getButton(-1);
                            final cxah cxahVar2 = cxahVar;
                            final EditText editText = editTextA;
                            button.setOnClickListener(new View.OnClickListener() { // from class: cxag
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) throws NumberFormatException {
                                    cxah cxahVar3 = cxahVar2;
                                    EditText editText2 = editText;
                                    DialogInterface dialogInterface2 = dialogInterface;
                                    try {
                                        int i = Integer.parseInt(editText2.getText().toString().trim());
                                        ((bvur) cxahVar3.e.b()).f(i);
                                        ((dakl) cxahVar3.b.b()).j(a.g(i, "Set multiplier = "));
                                        dialogInterface2.dismiss();
                                    } catch (RuntimeException e) {
                                        cqca.p("Bugle", e, "Failed to set multiplier.");
                                        ((dakl) cxahVar3.b.b()).j("Failed to set multiplier.");
                                        dialogInterface2.dismiss();
                                    }
                                }
                            });
                        }
                    });
                    alertDialogCreate.show();
                }
            }, optional);
        }
        SubMenu subMenuAddSubMenu3 = menu.addSubMenu("App commands");
        k(subMenuAddSubMenu3, "Dump Database", new cxrw() { // from class: cxfn
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                cxsa cxsaVar = this.a;
                if (apru.a()) {
                    ((cygh) cxsaVar.be.b()).a(cyfvVar.a, aazm.NOT_REDACTED);
                } else {
                    ((cygh) cxsaVar.be.b()).b(cyfvVar.a, false);
                }
            }
        }, optional);
        k(subMenuAddSubMenu3, "Dump Database (Redacted)", new cxrw() { // from class: cxfo
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                cxsa cxsaVar = this.a;
                if (apru.a()) {
                    ((cygh) cxsaVar.be.b()).a(cyfvVar.a, aazm.REDACTED);
                } else {
                    ((cygh) cxsaVar.be.b()).b(cyfvVar.a, true);
                }
            }
        }, optional);
        k(subMenuAddSubMenu3, "Analyze Database", new cxrw() { // from class: cxfp
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                dqru.e(((dqom) bsrj.a()).b).v("ANALYZE");
                Toast.makeText(this.a.x, "ANALYZE completed", 1).show();
            }
        }, optional);
        k(subMenuAddSubMenu3, "Dump WorkManager Database", new cxrw() { // from class: cxfq
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                final Activity activity = cyfvVar.a;
                final File file = new File(activity.getNoBackupFilesDir(), "androidx.work.workdb");
                final File fileE = cbpu.e(activity, "wm_db_copy.db");
                Runnable runnable = new Runnable() { // from class: cxms
                    @Override // java.lang.Runnable
                    public final void run() throws IOException {
                        ekrg ekrgVar = cxsa.c;
                        File file2 = file;
                        File file3 = fileE;
                        try {
                            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file2));
                            try {
                                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file3));
                                try {
                                    efvk.a(bufferedInputStream, bufferedOutputStream);
                                    bufferedOutputStream.close();
                                    bufferedInputStream.close();
                                } finally {
                                }
                            } finally {
                            }
                        } catch (IOException e) {
                            ekrw ekrwVarI = cxsa.c.i();
                            ekrwVarI.X(eksq.a, "Bugle");
                            ((ekrd) ((ekrd) ((ekrd) ekrwVarI).g(e)).h("com/google/android/apps/messaging/ui/debug/DebugUtilsImpl", "actionDumpWorkManagerDatabase", (char) 6556, "DebugUtilsImpl.java")).q("error getting wm database");
                        }
                    }
                };
                cxsa cxsaVar = this.a;
                auvh.i(eijx.f(runnable, cxsaVar.af), new Consumer() { // from class: cxnd
                    public final /* synthetic */ String b = "wm_db_copy.db";

                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) throws IOException {
                        ekrg ekrgVar = cxsa.c;
                        Activity activity2 = activity;
                        kxc kxcVar = new kxc(activity2);
                        kxcVar.c("Share Messages workmanager db");
                        kxcVar.d("application/sql");
                        kxcVar.b(cbpu.d(activity2, this.b));
                        Intent intentA = kxcVar.a();
                        intentA.setFlags(1);
                        eiid.o(activity2, intentA);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                }, cxsaVar.I);
            }
        }, optional);
        if (apru.a()) {
            k(subMenuAddSubMenu3, "Dump db for Contacts Sync", new cxrw() { // from class: cxfr
                @Override // defpackage.cxrw
                public final void a(final cyfv cyfvVar) {
                    AlertDialog.Builder message = new AlertDialog.Builder(cyfvVar.a).setTitle("Dump Messages database for contacts sync debugging").setMessage("This command will dump a partially redacted database that includes the phone numbers and/or email addresses used in Messages conversations, but all other PII (including names and message content) will be redacted.");
                    final cxsa cxsaVar = this.a;
                    message.setPositiveButton("Continue", new DialogInterface.OnClickListener() { // from class: cxlb
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            ((cygh) cxsaVar.be.b()).a(cyfvVar.a, aazm.c);
                        }
                    }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() { // from class: cxlc
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            ekrg ekrgVar = cxsa.c;
                            dialogInterface.dismiss();
                        }
                    }).show();
                }
            }, optional);
        }
        k(subMenuAddSubMenu3, "Toggle Database Sounds", new cxrw() { // from class: cxft
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                final cxsa cxsaVar = this.a;
                cxsaVar.af.submit(new Runnable() { // from class: cxqa
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((crqv) ((bxcm) cxsaVar.aX.b()).a.b()).g("sound_for_debug_plugin_enabled_key", !((crqv) r0.b()).q("sound_for_debug_plugin_enabled_key", false));
                    }
                });
            }
        }, optional);
        k(subMenuAddSubMenu3, "Dump messages to csv file", new cxrw() { // from class: cxfu
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                final Activity activity = cyfvVar.a;
                AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                ScrollView scrollView = new ScrollView(activity);
                LinearLayout linearLayout = new LinearLayout(activity);
                linearLayout.setPadding(20, 0, 20, 0);
                scrollView.addView(linearLayout);
                scrollView.setFillViewport(true);
                linearLayout.setOrientation(1);
                builder.setView(scrollView);
                builder.setTitle("Create csv file with messages from");
                final ArrayAdapter arrayAdapter = new ArrayAdapter(activity, R.layout.simple_spinner_dropdown_item, cxsj.a);
                final ru ruVar = new ru(activity);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.setMargins(0, 48, 0, 48);
                ruVar.setLayoutParams(layoutParams);
                ruVar.setAdapter((SpinnerAdapter) arrayAdapter);
                linearLayout.addView(ruVar);
                final eegq eegqVar = new eegq(activity);
                eegqVar.setText("Strip all digits");
                eegqVar.f(1);
                linearLayout.addView(eegqVar);
                final cxsa cxsaVar = this.a;
                builder.setPositiveButton("Create", new DialogInterface.OnClickListener() { // from class: cxji
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        cxsa cxsaVar2 = cxsaVar;
                        CheckBox checkBox = eegqVar;
                        ArrayAdapter arrayAdapter2 = arrayAdapter;
                        ru ruVar2 = ruVar;
                        final Activity activity2 = activity;
                        try {
                            ((dakl) cxsaVar2.Y.b()).j("Generating the file.");
                            final ArrayList arrayList = new ArrayList();
                            if (checkBox.isChecked()) {
                                arrayList.add(new cxsi());
                            }
                            final cxsj cxsjVar = (cxsj) cxsaVar2.P.b();
                            final cxsg cxsgVar = (cxsg) arrayAdapter2.getItem(ruVar2.getSelectedItemPosition());
                            cxsgVar.getClass();
                            auvh.i(eiju.g(eijx.g(new Callable() { // from class: cxsd
                                @Override // java.util.concurrent.Callable
                                public final Object call() throws IOException {
                                    ParticipantsTable.BindData bindData;
                                    boolean z2;
                                    Locale locale = Locale.US;
                                    cxsg cxsgVar2 = cxsgVar;
                                    cxsg cxsgVar3 = cxsg.SHORT_CODE;
                                    boolean z3 = true;
                                    String str = String.format(locale, "messages-%s.csv", cxsgVar2 == cxsgVar3 ? "short-code" : "all");
                                    cxsj cxsjVar2 = cxsjVar;
                                    baxe baxeVar = (baxe) cxsjVar2.d.b();
                                    List list = arrayList;
                                    eieu eieuVarK = eiiy.k("MessageDatabaseOperations#getAllMessages");
                                    try {
                                        ecem.b();
                                        ArrayList<MessageCoreData> arrayList2 = new ArrayList();
                                        brdr brdrVarD = MessagesTable.d();
                                        brdrVarD.A("getAllMessages");
                                        brdrVarD.d(new brdo(MessagesTable.c.i, true));
                                        brap brapVar = (brap) brdrVarD.b().p();
                                        while (brapVar.moveToNext()) {
                                            try {
                                                MessageCoreData messageCoreDataA = ((bveg) baxeVar.e.b()).a();
                                                messageCoreDataA.aO(brapVar);
                                                ((bbae) baxeVar.f.b()).c(messageCoreDataA, false);
                                                baxeVar.O(messageCoreDataA);
                                                arrayList2.add(messageCoreDataA);
                                            } finally {
                                            }
                                        }
                                        brapVar.close();
                                        eieuVarK.close();
                                        Map map = (Map) Collection.EL.stream(((bbca) cxsjVar2.c.b()).g()).collect(ekcv.a(new Function() { // from class: cxsb
                                            @Override // java.util.function.Function
                                            /* renamed from: andThen */
                                            public final /* synthetic */ Function mo536andThen(Function function) {
                                                return Function$CC.$default$andThen(this, function);
                                            }

                                            @Override // java.util.function.Function
                                            public final Object apply(Object obj) {
                                                return ((ParticipantsTable.BindData) obj).R();
                                            }

                                            public final /* synthetic */ Function compose(Function function) {
                                                return Function$CC.$default$compose(this, function);
                                            }
                                        }, new Function() { // from class: cxsc
                                            @Override // java.util.function.Function
                                            /* renamed from: andThen */
                                            public final /* synthetic */ Function mo536andThen(Function function) {
                                                return Function$CC.$default$andThen(this, function);
                                            }

                                            @Override // java.util.function.Function
                                            public final Object apply(Object obj) {
                                                ParticipantsTable.BindData bindData2 = (ParticipantsTable.BindData) obj;
                                                ekgb ekgbVar = cxsj.a;
                                                return bindData2;
                                            }

                                            public final /* synthetic */ Function compose(Function function) {
                                                return Function$CC.$default$compose(this, function);
                                            }
                                        }));
                                        Context context = cxsjVar2.b;
                                        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(cbpu.e(context, str)));
                                        try {
                                            outputStreamWriter.write("Sender,Message\n");
                                            for (MessageCoreData messageCoreData : arrayList2) {
                                                ArrayList arrayList3 = new ArrayList();
                                                arrayList3.add(new cxsh());
                                                if (!list.isEmpty()) {
                                                    arrayList3.addAll(list);
                                                }
                                                arrayList3.add(new cxse());
                                                String strAs = messageCoreData.as();
                                                if (!TextUtils.isEmpty(strAs) && (bindData = (ParticipantsTable.BindData) map.get(messageCoreData.aB())) != null) {
                                                    String strT = bindData.T();
                                                    if (cxsgVar2 == cxsgVar3) {
                                                        z2 = z3;
                                                        cmvy cmvyVar = cxsjVar2.e;
                                                        if (alwh.k(strT) && !cmvyVar.g(strT)) {
                                                        }
                                                        z3 = z2;
                                                    } else {
                                                        z2 = z3;
                                                    }
                                                    Iterator it3 = arrayList3.iterator();
                                                    while (it3.hasNext()) {
                                                        strAs = ((cxsf) it3.next()).a(strAs);
                                                    }
                                                    Object[] objArr = new Object[2];
                                                    objArr[0] = bindData.O();
                                                    objArr[z2 ? 1 : 0] = strAs;
                                                    outputStreamWriter.write(String.format("%s,\"%s\"\n", objArr));
                                                    z3 = z2;
                                                }
                                            }
                                            Uri uriD = cbpu.d(context, str);
                                            outputStreamWriter.close();
                                            return uriD;
                                        } finally {
                                        }
                                    } finally {
                                    }
                                }
                            }, cxsjVar.f)), new Consumer() { // from class: cxeo
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void z(Object obj) throws IOException {
                                    Uri uri = (Uri) obj;
                                    ekrg ekrgVar = cxsa.c;
                                    if (uri == null) {
                                        return;
                                    }
                                    Activity activity3 = activity2;
                                    kxc kxcVar = new kxc(activity3);
                                    kxcVar.c("Share Messages csv");
                                    kxcVar.d("text/csv");
                                    kxcVar.b(uri);
                                    Intent intentA = kxcVar.a();
                                    intentA.setFlags(1);
                                    eiid.o(activity3, intentA);
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            }, cxsaVar2.I);
                        } catch (Exception e) {
                            ((dakl) cxsaVar2.Y.b()).j("Error: ".concat(String.valueOf(e.getMessage())));
                        }
                        dialogInterface.dismiss();
                    }
                });
                builder.setNegativeButton("Close", new DialogInterface.OnClickListener() { // from class: cxjj
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        ekrg ekrgVar = cxsa.c;
                        dialogInterface.dismiss();
                    }
                });
                builder.create().show();
            }
        }, optional);
        k(subMenuAddSubMenu3, "Show Row Counts", new cxrw() { // from class: cxfv
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                botb botbVarE = botm.e();
                botbVarE.A("actionShowDatabaseRowCounts-conversations");
                botbVarE.s();
                int iH = botbVarE.b().h();
                bsbo bsboVarE = ParticipantsTable.e();
                bsboVarE.A("actionShowDatabaseRowCounts-participants");
                bsboVarE.s();
                int iH2 = bsboVarE.b().h();
                brdr brdrVarD = MessagesTable.d();
                brdrVarD.A("actionShowDatabaseRowCounts-messages");
                brdrVarD.s();
                brao braoVar = MessagesTable.c.j;
                brdrVarD.w(braoVar);
                brdrVarD.c(braoVar);
                brdrVarD.n(new dqxm("COUNT(*)"), "count");
                ekgp ekgpVar = (ekgp) brdrVarD.b().E().collect(ekcv.a(new Function() { // from class: cxne
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return Integer.valueOf(((MessagesTable.BindData) obj).m());
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Function() { // from class: cxnf
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        ekrg ekrgVar = cxsa.c;
                        return Integer.valueOf(Integer.parseInt(((MessagesTable.BindData) obj).az("count")));
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }));
                Integer num = (Integer) Collection.EL.stream(ekgpVar.values()).reduce(0, new BinaryOperator() { // from class: cxng
                    public final /* synthetic */ BiFunction andThen(Function function) {
                        return BiFunction$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.BiFunction
                    public final Object apply(Object obj, Object obj2) {
                        return Integer.valueOf(((Integer) obj).intValue() + ((Integer) obj2).intValue());
                    }
                });
                num.intValue();
                bsje bsjeVarC = PartsTable.c();
                bsjeVarC.A("actionShowDatabaseRowCounts-parts");
                bsjeVarC.s();
                new AlertDialog.Builder(cyfvVar.a).setTitle("Database Item Counts").setMessage(String.format(Locale.US, "Conversations: %d\nParticipants: %d\nMessages: %d\nSMS Messages: %d\nMMS Messages: %d\nRCS Messages: %d\nTombstone Messages: %d\nMessage Parts: %d", Integer.valueOf(iH), Integer.valueOf(iH2), num, ekgpVar.getOrDefault(0, 0), ekgpVar.getOrDefault(1, 0), ekgpVar.getOrDefault(3, 0), ekgpVar.getOrDefault(5, 0), Integer.valueOf(bsjeVarC.b().h()))).setCancelable(true).show();
            }
        }, optional);
        k(subMenuAddSubMenu3, "Log Telephony Data", new cxrw() { // from class: cxfw
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                cxsa cxsaVar = this.a;
                Context context = (Context) ((aazr) cxsaVar.h.b()).a.b();
                context.getClass();
                eiju eijuVarG = eiju.g(new LogTelephonyDatabaseAction(context).s());
                final Activity activity = cyfvVar.a;
                auvh.i(eijuVarG, new Consumer() { // from class: cxjt
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) throws IOException {
                        ekrg ekrgVar = cxsa.c;
                        Activity activity2 = activity;
                        kxc kxcVar = new kxc(activity2);
                        kxcVar.c("Share Telephony db");
                        kxcVar.d("application/text");
                        kxcVar.b((Uri) obj);
                        Intent intentA = kxcVar.a();
                        intentA.setFlags(1);
                        eiid.o(activity2, intentA);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                }, cxsaVar.I);
            }
        }, optional);
        k(subMenuAddSubMenu3, "Create BackupDb", new cxrw() { // from class: cxfx
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                final cxsa cxsaVar = this.a;
                eiju eijuVarH = eijx.h(new eooy() { // from class: cxoz
                    @Override // defpackage.eooy
                    public final ListenableFuture a() {
                        aysi aysiVar = (aysi) cxsaVar.aP.b();
                        aytc aytcVar = new aytc(true, null, null, 14);
                        UUID uuidRandomUUID = UUID.randomUUID();
                        azva azvaVar = azva.BACKUP_FEATURE_TEST;
                        uuidRandomUUID.getClass();
                        azvaVar.getClass();
                        return auvw.c(aysiVar.f, fcyi.a, fdjz.a, new aysh(aysiVar, aytcVar, uuidRandomUUID, azvaVar, null));
                    }
                }, cxsaVar.af);
                final Activity activity = cyfvVar.a;
                ejvr ejvrVar = new ejvr() { // from class: cxpa
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        cxsa cxsaVar2 = cxsaVar;
                        Context context = cxsaVar2.x;
                        Activity activity2 = activity;
                        try {
                            elec.a(new FileInputStream(((aysb) obj).a), new FileOutputStream(cbpu.e(context, "bugle_backup_db")));
                            Uri uriD = cbpu.d(context, "bugle_backup_db");
                            kxc kxcVar = new kxc(activity2);
                            kxcVar.c("Share Backup db");
                            kxcVar.d("application/sql");
                            kxcVar.b(uriD);
                            Intent intentA = kxcVar.a();
                            intentA.setFlags(1);
                            eiid.o(activity2, intentA);
                            return null;
                        } catch (IOException e) {
                            ekrw ekrwVarJ = cxsa.c.j();
                            ekrwVarJ.X(eksq.a, "Bugle");
                            ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(e)).h("com/google/android/apps/messaging/ui/debug/DebugUtilsImpl", "actionWriteBackup", (char) 2426, "DebugUtilsImpl.java")).q("Failed to copy BackupDb");
                            ((dakl) cxsaVar2.Y.b()).j("Failed to copy BackupDb");
                            return null;
                        }
                    }
                };
                eosc eoscVar = cxsaVar.I;
                eijuVarH.h(ejvrVar, eoscVar).e(Throwable.class, new ejvr() { // from class: cxpb
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        Throwable th = (Throwable) obj;
                        ekrw ekrwVarH = cxsa.c.h();
                        ekrwVarH.X(eksq.a, "Bugle");
                        ((ekrd) ((ekrd) ((ekrd) ekrwVarH).g(th)).h("com/google/android/apps/messaging/ui/debug/DebugUtilsImpl", "actionWriteBackup", (char) 2435, "DebugUtilsImpl.java")).q("Failed to create BackupDb");
                        ((dakl) cxsaVar.Y.b()).j("Failed to create BackupDb: ".concat(String.valueOf(th.getClass().getSimpleName())));
                        return null;
                    }
                }, eoscVar);
            }
        }, optional);
        k(subMenuAddSubMenu3, "Restore Workflow History", new cxrw() { // from class: cxfy
            @Override // defpackage.cxrw
            public final void a(final cyfv cyfvVar) {
                final cxsa cxsaVar = this.a;
                eooy eooyVar = new eooy() { // from class: cxnz
                    @Override // defpackage.eooy
                    public final ListenableFuture a() {
                        ahwd ahwdVar = (ahwd) cxsaVar.bc.b();
                        return auvw.c(ahwdVar.e, fcyi.a, fdjz.a, new ahuw(ahwdVar, null));
                    }
                };
                eosd eosdVar = cxsaVar.af;
                final eiju eijuVarH = eijx.h(eooyVar, eosdVar);
                final eiju eijuVarH2 = eijx.h(new eooy() { // from class: cxoa
                    @Override // defpackage.eooy
                    public final ListenableFuture a() {
                        ahwd ahwdVar = (ahwd) cxsaVar.bc.b();
                        return auvw.c(ahwdVar.e, fcyi.a, fdjz.a, new ahuz(ahwdVar, null));
                    }
                }, eosdVar);
                eijx.m(eijuVarH, eijuVarH2).a(new Callable() { // from class: cxob
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        ekrg ekrgVar = cxsa.c;
                        List list = (List) eork.q(eijuVarH);
                        List list2 = (List) eork.q(eijuVarH2);
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Active Executions:\n");
                        Iterable$EL.forEach(list, new Consumer() { // from class: cxmi
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void z(Object obj) {
                                cxsa.l((ahto) obj, sb);
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                        sb.append("\nInactive Executions:\n");
                        Iterable$EL.forEach(list2, new Consumer() { // from class: cxmj
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void z(Object obj) {
                                cxsa.l((ahto) obj, sb);
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                        return sb.toString();
                    }
                }, cxsaVar.ae).h(new ejvr() { // from class: cxoc
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        final cyfv cyfvVar2 = cyfvVar;
                        AlertDialog.Builder message = new AlertDialog.Builder(cyfvVar2.a).setTitle("Restore Workflow Execution Ids").setMessage((String) obj);
                        final cxsa cxsaVar2 = cxsaVar;
                        return message.setPositiveButton("Share Restore Workflow Logs", new DialogInterface.OnClickListener() { // from class: cxdt
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                final cxsa cxsaVar3 = cxsaVar2;
                                final Activity activity = cyfvVar2.a;
                                eiju eijuVarG = eijx.g(new Callable() { // from class: cxlt
                                    @Override // java.util.concurrent.Callable
                                    public final Object call() throws IOException {
                                        File[] fileArrListFiles = activity.getApplicationContext().getDir("logs", 0).listFiles(new FileFilter() { // from class: cxcx
                                            @Override // java.io.FileFilter
                                            public final boolean accept(File file) {
                                                ekrg ekrgVar = cxsa.c;
                                                return file.getName().startsWith("bugle_restore_logs.txt");
                                            }
                                        });
                                        File fileE = cbpu.e(cxsaVar3.x, "restore_logs.zip");
                                        FileOutputStream fileOutputStream = new FileOutputStream(fileE);
                                        try {
                                            ZipOutputStream zipOutputStream = new ZipOutputStream(fileOutputStream);
                                            try {
                                                fileArrListFiles.getClass();
                                                for (File file : fileArrListFiles) {
                                                    zipOutputStream.putNextEntry(new ZipEntry(file.getName()));
                                                    zipOutputStream.write(eleh.b(file));
                                                    zipOutputStream.closeEntry();
                                                }
                                                zipOutputStream.close();
                                                fileOutputStream.close();
                                                return fileE;
                                            } finally {
                                            }
                                        } catch (Throwable th) {
                                            try {
                                                fileOutputStream.close();
                                            } catch (Throwable th2) {
                                                th.addSuppressed(th2);
                                            }
                                            throw th;
                                        }
                                    }
                                }, cxsaVar3.af);
                                ejvr ejvrVar = new ejvr() { // from class: cxlu
                                    @Override // defpackage.ejvr
                                    public final Object apply(Object obj2) throws IOException {
                                        Uri uriD = cbpu.d(cxsaVar3.x, "restore_logs.zip");
                                        Activity activity2 = activity;
                                        kxc kxcVar = new kxc(activity2);
                                        kxcVar.c("Share Restore Log Files");
                                        kxcVar.d("application/zip");
                                        kxcVar.b(uriD);
                                        Intent intentA = kxcVar.a();
                                        intentA.setFlags(1);
                                        eiid.o(activity2, intentA);
                                        return null;
                                    }
                                };
                                eosc eoscVar = cxsaVar3.I;
                                eijuVarG.h(ejvrVar, eoscVar).e(Throwable.class, new ejvr() { // from class: cxlv
                                    @Override // defpackage.ejvr
                                    public final Object apply(Object obj2) {
                                        Throwable th = (Throwable) obj2;
                                        ekrw ekrwVarH = cxsa.c.h();
                                        ekrwVarH.X(eksq.a, "Bugle");
                                        ((ekrd) ((ekrd) ((ekrd) ekrwVarH).g(th)).h("com/google/android/apps/messaging/ui/debug/DebugUtilsImpl", "exportRestoreLogFiles", (char) 2534, "DebugUtilsImpl.java")).q("Failed to collect restore logs");
                                        ((dakl) cxsaVar3.Y.b()).j("Failed to collect restore logs: ".concat(String.valueOf(th.getClass().getSimpleName())));
                                        return null;
                                    }
                                }, eoscVar);
                            }
                        }).setNegativeButton("Done", new DialogInterface.OnClickListener() { // from class: cxee
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                ekrg ekrgVar = cxsa.c;
                                dialogInterface.dismiss();
                            }
                        }).setCancelable(true).show();
                    }
                }, cxsaVar.I);
            }
        }, optional);
        k(subMenuAddSubMenu3, "Log Recurring Profile Data", new cxrw() { // from class: cxfz
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                cxsa cxsaVar = this.a;
                Optional optional2 = (Optional) cxsaVar.M.b();
                if (optional2.isEmpty()) {
                    ((dakl) cxsaVar.Y.b()).j("Profile Metrics is not available in this build");
                    return;
                }
                final Activity activity = cyfvVar.a;
                cyix cyixVar = (cyix) optional2.get();
                auvh.i(auvw.b(new cyiw(cyixVar), cyixVar.a), new Consumer() { // from class: cxnv
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        ekrg ekrgVar = cxsa.c;
                        new AlertDialog.Builder(activity).setTitle("Profile Recurring Metrics").setMessage((String) obj).setCancelable(true).show();
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                }, cxsaVar.I);
            }
        }, optional);
        k(subMenuAddSubMenu3, "Force sync SMS", new cxrw() { // from class: cxga
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                cxsa cxsaVar = this.a;
                ((crqv) cxsaVar.q.b()).k("last_full_sync_time_millis", -1L);
                ((cmqf) cxsaVar.m.b()).k(enqq.DEBUG_UTILS);
            }
        }, optional);
        k(subMenuAddSubMenu3, "Sync SMS", new cxrw() { // from class: cxgb
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                ((cmqf) this.a.m.b()).l(enqq.DEBUG_UTILS);
            }
        }, optional);
        k(subMenuAddSubMenu3, "Load SMS/MMS from dump file", new cxrw() { // from class: cxge
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                new cxry("Bugle.Async.DebugUtils.showDebugOptions.LoadSmsMmsFromDumpFile.Duration", cyfvVar.a, "load", (cqjy) this.a.U.b()).e(new Void[0]);
            }
        }, optional);
        k(subMenuAddSubMenu3, "Email SMS/MMS dump file", new cxrw() { // from class: cxgf
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                new cxry("Bugle.Async.DebugUtils.showDebugOptions.EmailSmsMmsDumpFile.Duration", cyfvVar.a, "email", (cqjy) this.a.U.b()).e(new Void[0]);
            }
        }, optional);
        k(subMenuAddSubMenu3, "Schedule Telemetry Alarm for now", new cxrw() { // from class: cxgh
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                Calendar calendar = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
                calendar.add(13, 10);
                cxsa cxsaVar = this.a;
                ((ajat) cxsaVar.t.b()).f(calendar);
                ((dakl) cxsaVar.Y.b()).j("Alarm to run soon (max couple mins). Confirm via logs.");
            }
        }, optional);
        k(subMenuAddSubMenu3, "Run Recurring Telemetry Directly", new cxrw() { // from class: cxgi
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                cxsa cxsaVar = this.a;
                ((ayds) ((ajat) cxsaVar.t.b()).H.b()).a().q(null);
                ((dakl) cxsaVar.Y.b()).j("Running recurring logging. Confirm via logs.");
            }
        }, optional);
        k(subMenuAddSubMenu3, "Schedule reverse sync immediately", new cxrw() { // from class: cxgj
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                final cxsa cxsaVar = this.a;
                auvh.h(eijx.f(new Runnable() { // from class: cxnx
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((cnod) cxsaVar.ar.b()).a();
                    }
                }, cxsaVar.af));
            }
        }, optional);
        k(subMenuAddSubMenu3, "Schedule incremental reverse sync immediately", new cxrw() { // from class: cxgk
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                final cxsa cxsaVar = this.a;
                auvh.h(eijx.f(new Runnable() { // from class: cxjp
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((cnlx) cxsaVar.aV.b()).a(null);
                    }
                }, cxsaVar.af));
            }
        }, optional);
        k(subMenuAddSubMenu3, "Schedule Telephony Parts Charset update immediately", new cxrw() { // from class: cxgl
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                final cxsa cxsaVar = this.a;
                auvh.h(eijx.f(new Runnable() { // from class: cxkt
                    @Override // java.lang.Runnable
                    public final void run() {
                        coeu coeuVar = (coeu) cxsaVar.aW.b();
                        ewte ewteVar = (ewte) ewtf.a.createBuilder();
                        ewteVar.getClass();
                        ewta ewtaVar = (ewta) ewtb.a.createBuilder();
                        ewtaVar.getClass();
                        evsn evsnVarBuild = ewtaVar.build();
                        evsnVarBuild.getClass();
                        ewteVar.copyOnWrite();
                        ewtf ewtfVar = (ewtf) ewteVar.instance;
                        ewtfVar.c = (ewtb) evsnVarBuild;
                        ewtfVar.b = 1;
                        evsn evsnVarBuild2 = ewteVar.build();
                        evsnVarBuild2.getClass();
                        evsf builder = ((ewtf) evsnVarBuild2).toBuilder();
                        builder.getClass();
                        auvw.k(coeuVar.c, null, null, new coet(coeuVar, (ewte) builder, null), 3);
                    }
                }, cxsaVar.af));
            }
        }, optional);
        k(subMenuAddSubMenu3, "Capture bug report (PH controlled)", new cxrw() { // from class: cxgm
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                ((aikm) this.a.T.b()).a("manual from Debug menu");
            }
        }, optional);
        k(subMenuAddSubMenu3, true != ((cqjy) fcsuVar.b()).g ? "Turn on Class Zero test" : "Turn off Class 0 sms test", new cxrw() { // from class: cxgn
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                boolean zBooleanValue = ((Boolean) cqjy.b.e()).booleanValue();
                final cxsa cxsaVar = this.a;
                final Activity activity = cyfvVar.a;
                if (zBooleanValue) {
                    cxsaVar.o(activity, "enableClassZeroSms", Boolean.toString(!((cqjy) cxsaVar.U.b()).g), new Runnable() { // from class: cxjg
                        @Override // java.lang.Runnable
                        public final void run() {
                            ((cqjy) cxsaVar.U.b()).n();
                            cxsa.r(activity);
                        }
                    }, null, null);
                } else {
                    ((cqjy) cxsaVar.U.b()).n();
                    cxsa.r(activity);
                }
            }
        }, optional);
        k(subMenuAddSubMenu3, "Trigger SMS Tickle", new cxrw() { // from class: cxgp
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                cxsa cxsaVar = this.a;
                crof crofVarH = cxsaVar.h(cxsaVar.e());
                if (crofVarH == null) {
                    ((dakl) cxsaVar.Y.b()).j("SMS tickle failed to get subscriptionUtils");
                    return;
                }
                cfre cfreVarG = cxsaVar.g(crofVarH);
                eztx eztxVar = (eztx) ezua.a.createBuilder();
                String str = cfreVarG.b;
                eztxVar.copyOnWrite();
                ezua ezuaVar = (ezua) eztxVar.instance;
                str.getClass();
                ezuaVar.f = str;
                eztxVar.copyOnWrite();
                ((ezua) eztxVar.instance).d = 1;
                eztxVar.copyOnWrite();
                ((ezua) eztxVar.instance).g = "RCS";
                felm felmVar = felm.PHONE_NUMBER;
                eztxVar.copyOnWrite();
                ((ezua) eztxVar.instance).e = felmVar.a();
                ((cdeb) cxsaVar.aJ.b()).a((ezua) eztxVar.build());
                ((dakl) cxsaVar.Y.b()).j("SMS tickle sent");
            }
        }, optional);
        k(subMenuAddSubMenu3, true != cpiz.b ? "Use local contact blocking" : "Revert to system contact blocking", new cxrw() { // from class: cxgq
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                cxsa cxsaVar = this.a;
                cpiz cpizVar = (cpiz) cxsaVar.V.b();
                cpiz.b = !cpiz.b;
                if (cpiz.b) {
                    cpizVar.b(false);
                }
                Activity activity = cyfvVar.a;
                ((avmp) cxsaVar.v.b()).i(activity);
                cxsa.r(activity);
            }
        }, optional);
        k(subMenuAddSubMenu3, "Send \"restore complete\" intent to myself", new cxrw() { // from class: cxgr
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                cyfvVar.a.sendBroadcast(((cldu) this.a.k.b()).d());
            }
        }, optional);
        k(subMenuAddSubMenu3, true != ((cqjy) fcsuVar.b()).t ? "Emulate unknown SIM number" : "Stop emulating unknown SIM number", new cxrw() { // from class: cxgs
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                cxsa cxsaVar = this.a;
                ((cqjy) cxsaVar.U.b()).t = !((cqjy) r1.b()).t;
                ((ayge) cxsaVar.j.b()).b().K();
                cxsa.r(cyfvVar.a);
            }
        }, optional);
        k(subMenuAddSubMenu3, "Mark conversation as Not Yet Delivered", new cxrw() { // from class: cxgt
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                new cxrp(this.a, cyfvVar.b).e(new Void[0]);
            }
        }, optional);
        k(subMenuAddSubMenu3, "Check device service state", new cxrw() { // from class: cxgu
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                String str;
                TelephonyManager telephonyManager = (TelephonyManager) this.a.x.getSystemService("phone");
                String str2 = "Error";
                if (telephonyManager == null) {
                    str = "Can't retrieve telephony manager!";
                } else {
                    ServiceState serviceState = telephonyManager.getServiceState();
                    if (serviceState == null) {
                        str = "Service state is null!";
                    } else {
                        int state = serviceState.getState();
                        if (state == 0) {
                            str = "STATE_IN_SERVICE";
                        } else if (state == 1) {
                            str = "STATE_OUT_OF_SERVICE";
                        } else if (state == 2) {
                            str = "STATE_EMERGENCY_ONLY";
                        } else if (state != 3) {
                            str = "Unknown Service State: " + serviceState.getState();
                        } else {
                            str = "STATE_POWER_OFF";
                        }
                        str2 = "Service State";
                    }
                }
                new AlertDialog.Builder(cyfvVar.a).setTitle(str2).setMessage(str).setCancelable(true).show();
            }
        }, optional);
        k(subMenuAddSubMenu3, "Test sendMessage", new cxrw() { // from class: cxgv
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                cxsa cxsaVar = this.a;
                cfeh cfehVar = (cfeh) cxsaVar.aa.b();
                ezok ezokVar = (ezok) ezol.a.createBuilder();
                felm felmVar = felm.DITTO;
                ezokVar.copyOnWrite();
                ((ezol) ezokVar.instance).b = felmVar.a();
                ezokVar.copyOnWrite();
                ((ezol) ezokVar.instance).d = "Bugle";
                ezokVar.copyOnWrite();
                ((ezol) ezokVar.instance).c = "123";
                cfef cfefVarC = cfehVar.c((ezol) ezokVar.build(), Optional.empty(), epby.GET_UPDATES);
                cfefVarC.c = "12345";
                cfefVarC.b(eoze.a);
                cfefVarC.l = true;
                auvh.h(eiju.g(((cema) cxsaVar.y.b()).a(cfefVarC.a())));
            }
        }, optional);
        k(subMenuAddSubMenu3, "Enable happiness tracking survey", new cxrw() { // from class: cxgw
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                cxsa.q(cqry.d, Double.valueOf(1.0d));
                this.a.p();
            }
        }, optional);
        k(subMenuAddSubMenu3, "Enable Expressive Content HaTS", new cxrw() { // from class: cxgx
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                cxsa.n();
                cxsa.q(cqry.h, Double.valueOf(1.0d));
                cxsa cxsaVar = this.a;
                cxsaVar.p();
                cqrd cqrdVar = (cqrd) cxsaVar.aA.b();
                final long epochMilli = cxsaVar.l.f().toEpochMilli();
                cqrdVar.b(new ejvr() { // from class: cqqu
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        cqqr cqqrVar = (cqqr) obj;
                        cqqi cqqiVar = (cqqi) cqqrVar.toBuilder();
                        cqqk cqqkVar = cqqrVar.c;
                        if (cqqkVar == null) {
                            cqqkVar = cqqk.a;
                        }
                        long j = epochMilli;
                        cqqj cqqjVar = (cqqj) cqqkVar.toBuilder();
                        cqqjVar.copyOnWrite();
                        cqqk cqqkVar2 = (cqqk) cqqjVar.instance;
                        cqqkVar2.b |= 1;
                        cqqkVar2.c = j;
                        cqqk cqqkVar3 = (cqqk) cqqjVar.build();
                        cqqiVar.copyOnWrite();
                        cqqr cqqrVar2 = (cqqr) cqqiVar.instance;
                        cqqkVar3.getClass();
                        cqqrVar2.c = cqqkVar3;
                        cqqrVar2.b |= 1;
                        return (cqqr) cqqiVar.build();
                    }
                });
            }
        }, optional);
        k(subMenuAddSubMenu3, "Enable XMS Group Message HaTS", new cxrw() { // from class: cxgz
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                cxsa.n();
                cxsa.q(cqry.j, Double.valueOf(1.0d));
                cxsa cxsaVar = this.a;
                cxsaVar.p();
                cqrd cqrdVar = (cqrd) cxsaVar.aA.b();
                final long epochMilli = cxsaVar.l.f().toEpochMilli();
                cqrdVar.b(new ejvr() { // from class: cqqx
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        cqqr cqqrVar = (cqqr) obj;
                        cqqi cqqiVar = (cqqi) cqqrVar.toBuilder();
                        cqqm cqqmVar = cqqrVar.d;
                        if (cqqmVar == null) {
                            cqqmVar = cqqm.a;
                        }
                        long j = epochMilli;
                        cqql cqqlVar = (cqql) cqqmVar.toBuilder();
                        cqqlVar.copyOnWrite();
                        cqqm cqqmVar2 = (cqqm) cqqlVar.instance;
                        cqqmVar2.b |= 1;
                        cqqmVar2.c = j;
                        cqqm cqqmVar3 = (cqqm) cqqlVar.build();
                        cqqiVar.copyOnWrite();
                        cqqr cqqrVar2 = (cqqr) cqqiVar.instance;
                        cqqmVar3.getClass();
                        cqqrVar2.d = cqqmVar3;
                        cqqrVar2.b |= 2;
                        return (cqqr) cqqiVar.build();
                    }
                });
            }
        }, optional);
        k(subMenuAddSubMenu3, "Enable RCS Group Message HaTS", new cxrw() { // from class: cxha
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                cxsa.n();
                cxsa.q(cqry.l, Double.valueOf(1.0d));
                cxsa cxsaVar = this.a;
                cxsaVar.p();
                cqrd cqrdVar = (cqrd) cxsaVar.aA.b();
                final long epochMilli = cxsaVar.l.f().toEpochMilli();
                cqrdVar.b(new ejvr() { // from class: cqqz
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        cqqr cqqrVar = (cqqr) obj;
                        cqqi cqqiVar = (cqqi) cqqrVar.toBuilder();
                        cqqm cqqmVar = cqqrVar.d;
                        if (cqqmVar == null) {
                            cqqmVar = cqqm.a;
                        }
                        long j = epochMilli;
                        cqql cqqlVar = (cqql) cqqmVar.toBuilder();
                        cqqlVar.copyOnWrite();
                        cqqm cqqmVar2 = (cqqm) cqqlVar.instance;
                        cqqmVar2.b |= 2;
                        cqqmVar2.d = j;
                        cqqm cqqmVar3 = (cqqm) cqqlVar.build();
                        cqqiVar.copyOnWrite();
                        cqqr cqqrVar2 = (cqqr) cqqiVar.instance;
                        cqqmVar3.getClass();
                        cqqrVar2.d = cqqmVar3;
                        cqqrVar2.b |= 2;
                        return (cqqr) cqqiVar.build();
                    }
                });
            }
        }, optional);
        k(subMenuAddSubMenu3, "Disable play store rating or happiness tracking survey", new cxrw() { // from class: cxhb
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                ekrg ekrgVar = cxsa.c;
                cxsa.n();
            }
        }, optional);
        k(subMenuAddSubMenu3, "Reset HaTS flags to defaults", new cxrw() { // from class: cxhc
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                ekrg ekrgVar = cxsa.c;
                cxsa.u(cqry.p);
                cxsa.u(cqry.o);
                cxsa.u(cqry.n);
                cxsa.u(cqry.m);
                cxsa.u(cqry.q);
                cxsa.u(cqry.d);
                cxsa.u(cqry.j);
                cxsa.u(cqry.l);
                cxsa.u(cqry.f);
                cxsa.u(cqry.h);
            }
        }, optional);
        k(subMenuAddSubMenu3, "Test sharing a changing linked file", new cxrw() { // from class: cxhe
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) throws InterruptedException, IOException {
                Context context = this.a.x;
                String str = context.getFilesDir().getPath() + context.getPackageName() + "/";
                String strValueOf = String.valueOf(context.getFilesDir().getPath());
                String strConcat = str.concat("fake-sound.jpg");
                cxrv.a("rm ".concat(strConcat));
                cxrv.a("ln -s /system/media/audio/ringtones/Triton.ogg ".concat(strConcat));
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setPackage("com.google.android.apps.messaging");
                intent.putExtra("android.intent.extra.STREAM", Uri.parse("file://".concat(strConcat)));
                intent.setType("image/*");
                eiid.o(context, intent);
                new Handler().postDelayed(new cxru(strConcat, strValueOf.concat("com.google.android.apps.messaging/").concat("shared_prefs/bugle.xml"), context), 3000L);
            }
        }, optional);
        k(subMenuAddSubMenu3, true != ((cqjy) fcsuVar.b()).r ? "Enable mock Cequint" : "Disable mock Cequint", new cxrw() { // from class: cxhf
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                cxsa cxsaVar = this.a;
                fcsu fcsuVar2 = cxsaVar.U;
                ((cqjy) fcsuVar2.b()).r = !((cqjy) fcsuVar2.b()).r;
                ((dakl) cxsaVar.Y.b()).j(true != ((cqjy) fcsuVar2.b()).r ? "Mock Cequint disabled" : "Mock Cequint enabled");
                cxsa.r(cyfvVar.a);
            }
        }, optional);
        k(subMenuAddSubMenu3, "Create fake Telephony conversations...", new cxrw() { // from class: cxhg
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                final Activity activity = cyfvVar.a;
                AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                ScrollView scrollView = new ScrollView(activity);
                LinearLayout linearLayout = new LinearLayout(activity);
                scrollView.addView(linearLayout);
                scrollView.setFillViewport(true);
                linearLayout.setOrientation(1);
                builder.setView(scrollView);
                linearLayout.addView(cyfvVar.b("Total Conversations"));
                final EditText editTextA = cyfvVar.a(2);
                linearLayout.addView(editTextA);
                final Optional optional2 = cyfvVar.b;
                if (!optional2.isEmpty()) {
                    optional2.get();
                    throw null;
                }
                editTextA.setText("100");
                final cxsa cxsaVar = this.a;
                linearLayout.addView(cyfvVar.b("Messages per conversation"));
                final EditText editTextA2 = cyfvVar.a(2);
                editTextA2.setText("10");
                linearLayout.addView(editTextA2);
                TextView textViewB = cyfvVar.b("Message text (tap for help)");
                textViewB.setOnClickListener(new View.OnClickListener() { // from class: cxja
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ekrg ekrgVar = cxsa.c;
                        Toast.makeText(activity, String.format(Locale.US, "%s\n%s\n%s", "$M substitutes for message count", "$C substitutes for conversation count", "$U substitutes for random UUID"), 1).show();
                    }
                });
                linearLayout.addView(textViewB);
                final EditText editTextA3 = cyfvVar.a(1);
                editTextA3.setHint("Message X, conversation Y");
                linearLayout.addView(editTextA3);
                final Calendar calendar = Calendar.getInstance();
                final DatePicker datePicker = new DatePicker(cxsaVar.x);
                datePicker.setVisibility(8);
                datePicker.setPadding(20, 0, 0, 0);
                datePicker.setMaxDate(cxsaVar.l.f().toEpochMilli());
                TextView textViewB2 = cyfvVar.b("Message received date (tap to show/hide date picker)");
                textViewB2.setOnClickListener(new View.OnClickListener() { // from class: cxjc
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ekrg ekrgVar = cxsa.c;
                        DatePicker datePicker2 = datePicker;
                        if (datePicker2.isShown()) {
                            datePicker2.setVisibility(8);
                        } else {
                            datePicker2.setVisibility(0);
                        }
                    }
                });
                linearLayout.addView(textViewB2);
                linearLayout.addView(datePicker);
                final TextView textViewB3 = cyfvVar.b("Progress");
                linearLayout.addView(textViewB3);
                final ProgressBar progressBar = new ProgressBar(linearLayout.getContext(), null, R.attr.progressBarStyleHorizontal);
                progressBar.setPadding(32, 16, 23, 16);
                linearLayout.addView(progressBar);
                builder.setPositiveButton("Create", (DialogInterface.OnClickListener) null);
                builder.setNegativeButton("Close", new DialogInterface.OnClickListener() { // from class: cxjd
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        ekrg ekrgVar = cxsa.c;
                        dialogInterface.dismiss();
                    }
                });
                AlertDialog alertDialogCreate = builder.create();
                alertDialogCreate.setOnShowListener(new DialogInterface.OnShowListener() { // from class: cxje
                    @Override // android.content.DialogInterface.OnShowListener
                    public final void onShow(DialogInterface dialogInterface) {
                        Button button = ((AlertDialog) dialogInterface).getButton(-1);
                        final cxsa cxsaVar2 = cxsaVar;
                        final Optional optional3 = optional2;
                        final EditText editText = editTextA;
                        final EditText editText2 = editTextA2;
                        final EditText editText3 = editTextA3;
                        final Calendar calendar2 = calendar;
                        final DatePicker datePicker2 = datePicker;
                        final Activity activity2 = activity;
                        final TextView textView = textViewB3;
                        final ProgressBar progressBar2 = progressBar;
                        button.setOnClickListener(new View.OnClickListener() { // from class: cxjw
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r1v0, types: [cxjw] */
                            /* JADX WARN: Type inference failed for: r1v1 */
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) throws NumberFormatException {
                                cxsa cxsaVar3 = this;
                                TextView textView2 = textView;
                                cxsa cxsaVar4 = cxsaVar2;
                                Optional optional4 = optional3;
                                EditText editText4 = editText;
                                EditText editText5 = editText2;
                                EditText editText6 = editText3;
                                Calendar calendar3 = calendar2;
                                DatePicker datePicker3 = datePicker2;
                                Activity activity3 = activity2;
                                ProgressBar progressBar3 = progressBar2;
                                try {
                                } catch (Exception e) {
                                    e = e;
                                    cxsaVar3 = cxsaVar4;
                                }
                                try {
                                    if (!optional4.isEmpty()) {
                                        optional4.get();
                                        throw null;
                                    }
                                    int i = Integer.parseInt(editText4.getText().toString());
                                    int i2 = Integer.parseInt(editText5.getText().toString());
                                    if (i > 0 && i2 > 0) {
                                        String string = editText6.getText().toString();
                                        calendar3.set(datePicker3.getYear(), datePicker3.getMonth(), datePicker3.getDayOfMonth());
                                        long timeInMillis = calendar3.getTimeInMillis();
                                        Long lValueOf = Long.valueOf(timeInMillis);
                                        ((dakl) cxsaVar4.Y.b()).j(String.format(Locale.US, "Creating %d conversations with %d messages each", Integer.valueOf(i), Integer.valueOf(i2)));
                                        optional4.isPresent();
                                        cxsp cxspVar = (cxsp) cxsaVar4.ag.b();
                                        Context applicationContext = activity3.getApplicationContext();
                                        lValueOf.getClass();
                                        cxspVar.d(applicationContext, i, null, i2, textView2, progressBar3, string, timeInMillis, 25, 0L, (cmot) cxsaVar4.B.b(), cxsaVar4.x);
                                        return;
                                    }
                                    ((dakl) cxsaVar4.Y.b()).j("Please provide positive values.");
                                } catch (Exception e2) {
                                    e = e2;
                                    ((dakl) cxsaVar3.Y.b()).j("Error: ".concat(String.valueOf(e.getMessage())));
                                }
                            }
                        });
                    }
                });
                alertDialogCreate.show();
            }
        }, optional);
        k(subMenuAddSubMenu3, "Reset Link Previews to first view", new cxrw() { // from class: cxhh
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                new cxri(this.a, cyfvVar.a).e(new Void[0]);
            }
        }, optional);
        k(subMenuAddSubMenu3, "Fire Too Many Jobs (crashes on purpose)", new cxrw() { // from class: cxhi
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                for (int i = 0; i < 200; i++) {
                    cxsa cxsaVar = this.a;
                    ((aypf) cxsaVar.g.b()).a().x(Alert.DURATION_SHOW_INDEFINITELY - i, Action.t);
                }
            }
        }, optional);
        k(subMenuAddSubMenu3, "Send G1 Restore Intent", new cxrw() { // from class: cxhk
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                ekrg ekrgVar = cxsa.c;
                Activity activity = cyfvVar.a;
                Intent intent = new Intent(activity, (Class<?>) GoogleOneRestoreService.class);
                intent.setAction("com.android.Bugle.intent.action.RESTORE_ACTION");
                activity.bindService(intent, new cxrq(activity), 1);
            }
        }, optional);
        k(subMenuAddSubMenu3, "Fake telephony msg from number", new cxrw() { // from class: cxhl
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                this.a.v(cyfvVar, true, true);
            }
        }, optional);
        k(subMenuAddSubMenu3, "Add fake sim", new cxrw() { // from class: cxhm
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                final cxsa cxsaVar = this.a;
                final int i = cxsaVar.aQ;
                final int i2 = i + 2;
                cxsaVar.aQ = i + 1;
                cxsaVar.af.submit(eiid.k(new Runnable() { // from class: cxjy
                    @Override // java.lang.Runnable
                    public final void run() {
                        cxsa cxsaVar2 = cxsaVar;
                        crny crnyVar = (crny) cxsaVar2.C.b();
                        String str = "1234567654321" + i;
                        StringBuilder sb = new StringBuilder("Fake sim ");
                        int i3 = i2;
                        sb.append(i3);
                        crnyVar.t(i3, str, i3, sb.toString(), a.g(i3, "Fake carrier "), ((alrj) cxsaVar2.ax.b()).c("425-555-1212", new ejxr() { // from class: cxdi
                            @Override // defpackage.ejxr
                            public final Object get() {
                                ekrg ekrgVar = cxsa.c;
                                return Optional.of("US");
                            }
                        }), i3, Optional.empty());
                        ((bxjn) cxsaVar2.W.b()).c();
                    }
                }));
            }
        }, optional);
        k(subMenuAddSubMenu3, "Clear Glide cache", new cxrw() { // from class: cxhn
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                cxsa cxsaVar = this.a;
                raw rawVarB = raw.b(cxsaVar.x);
                rawVarB.h();
                new cxrs(cxsaVar, rawVarB).e(new Void[0]);
            }
        }, optional);
        k(subMenuAddSubMenu3, "Trigger debug receiver", new cxrw() { // from class: cxho
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                cxbw cxbwVar = new cxbw();
                IntentFilter intentFilter = new IntentFilter("com.google.android.apps.messaging.ui.debug.DebugReceiver");
                final cxsa cxsaVar = this.a;
                kxj.g(cxsaVar.x, cxbwVar, intentFilter);
                auvh.i(eiju.g(cxsaVar.ae.schedule(new Runnable() { // from class: cxgo
                    public final /* synthetic */ String b = "com.google.android.apps.messaging.ui.debug.DebugReceiver";

                    @Override // java.lang.Runnable
                    public final void run() {
                        cxsaVar.x.sendBroadcast(new Intent(this.b));
                    }
                }, 2L, TimeUnit.SECONDS)), new Consumer() { // from class: cxgy
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        ((dakl) cxsaVar.Y.b()).j("DebugReceiver triggered.");
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                }, eoqg.a);
                cyfvVar.a.finish();
            }
        }, optional);
        k(subMenuAddSubMenu3, "Show a specific message's annotations", new cxrw() { // from class: cxhq
            @Override // defpackage.cxrw
            public final void a(final cyfv cyfvVar) {
                Activity activity = cyfvVar.a;
                AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                ScrollView scrollView = new ScrollView(activity);
                LinearLayout linearLayout = new LinearLayout(activity);
                scrollView.addView(linearLayout);
                scrollView.setFillViewport(true);
                linearLayout.setOrientation(1);
                builder.setView(scrollView);
                linearLayout.addView(cyfvVar.b("Get Annotations for Message"));
                linearLayout.addView(cyfvVar.c());
                linearLayout.addView(cyfvVar.b("Message Id"));
                final EditText editTextA = cyfvVar.a(1);
                editTextA.setHint("Id of the message. Get it by: Long-click the message > Overflow menu > View details.");
                linearLayout.addView(editTextA);
                final cxsa cxsaVar = this.a;
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() { // from class: cxju
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        cxsa cxsaVar2 = cxsaVar;
                        EditText editText = editTextA;
                        cyfv cyfvVar2 = cyfvVar;
                        try {
                            final MessageIdType messageIdTypeB = bary.b(editText.getText().toString());
                            final Activity activity2 = cyfvVar2.a;
                            auvh.h(eijx.g(new Callable() { // from class: cxkz
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    ekrg ekrgVar = cxsa.c;
                                    bpzs bpzsVarA = bpzx.a();
                                    bpzsVarA.A("getSpecificMessageAnnotations");
                                    final MessageIdType messageIdType = messageIdTypeB;
                                    bpzsVarA.e(new Function() { // from class: cxnn
                                        @Override // java.util.function.Function
                                        /* renamed from: andThen */
                                        public final /* synthetic */ Function mo536andThen(Function function) {
                                            return Function$CC.$default$andThen(this, function);
                                        }

                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj) {
                                            bpzw bpzwVar = (bpzw) obj;
                                            ekrg ekrgVar2 = cxsa.c;
                                            bpzwVar.d(messageIdType);
                                            return bpzwVar;
                                        }

                                        public final /* synthetic */ Function compose(Function function) {
                                            return Function$CC.$default$compose(this, function);
                                        }
                                    });
                                    bpze bpzeVar = (bpze) bpzsVarA.b().p();
                                    try {
                                        ekgb ekgbVarCX = bpzeVar.cX();
                                        bpzeVar.close();
                                        return ekgbVarCX;
                                    } catch (Throwable th) {
                                        try {
                                            bpzeVar.close();
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                        }
                                        throw th;
                                    }
                                }
                            }, cxsaVar2.af).h(new ejvr() { // from class: cxla
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj) {
                                    ekgb ekgbVar = (ekgb) obj;
                                    ekrg ekrgVar = cxsa.c;
                                    Activity activity3 = activity2;
                                    if (ekgbVar == null || ekgbVar.isEmpty()) {
                                        new AlertDialog.Builder(activity3).setTitle("No annotations").setMessage(String.format("Message %s doesn't exist or has no annotations.", messageIdTypeB)).setCancelable(true).show();
                                    } else {
                                        String strJoin = TextUtils.join("\n--\n", Collection.EL.stream(ekgbVar).map(new Function() { // from class: cxli
                                            @Override // java.util.function.Function
                                            /* renamed from: andThen */
                                            public final /* synthetic */ Function mo536andThen(Function function) {
                                                return Function$CC.$default$andThen(this, function);
                                            }

                                            @Override // java.util.function.Function
                                            public final Object apply(Object obj2) {
                                                bpyn bpynVar = (bpyn) obj2;
                                                ekrg ekrgVar2 = cxsa.c;
                                                String strJoin2 = TextUtils.join("\n", ekgb.t("Conversation Id: ".concat(String.valueOf(String.valueOf(bpynVar.m()))), "Message Id: ".concat(String.valueOf(String.valueOf(bpynVar.n()))), "Type: " + bpynVar.k()));
                                                ezds ezdsVarO = bpynVar.o();
                                                if (ezdsVarO == null || ezdsVarO.c != 2) {
                                                    return strJoin2;
                                                }
                                                String strValueOf = String.valueOf(((ezei) ezdsVarO.d).b);
                                                return TextUtils.join("\n", ekgb.u(strJoin2, "OTP code: ".concat(strValueOf), "Start index: " + ezdsVarO.h, "End index: " + ezdsVarO.i));
                                            }

                                            public final /* synthetic */ Function compose(Function function) {
                                                return Function$CC.$default$compose(this, function);
                                            }
                                        }).toArray());
                                        ((ClipboardManager) activity3.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Annotation", strJoin));
                                        new AlertDialog.Builder(activity3).setTitle("Annotations").setMessage(strJoin).setCancelable(true).show();
                                    }
                                    return true;
                                }
                            }, cxsaVar2.I));
                        } catch (Exception e) {
                            ((dakl) cxsaVar2.Y.b()).j("Failed to show specific message annotations: ".concat(String.valueOf(e.getMessage())));
                        }
                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() { // from class: cxjv
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        ekrg ekrgVar = cxsa.c;
                        dialogInterface.dismiss();
                    }
                });
                builder.create().show();
            }
        }, optional);
        if (!cqbe.g()) {
            k(subMenuAddSubMenu3, "Dump example store iteration...", new cxrw() { // from class: cxhr
                @Override // defpackage.cxrw
                public final void a(cyfv cyfvVar) {
                    cxsa cxsaVar = this.a;
                    Optional optional2 = (Optional) ((eyig) cxsaVar.ak).a;
                    if (optional2.isPresent()) {
                        ((danx) optional2.get()).a();
                    } else {
                        ((dakl) cxsaVar.Y.b()).j("Example store debug menu not available in this build");
                    }
                }
            }, optional);
        }
        k(subMenuAddSubMenu3, "Force import contacts data", new cxrw() { // from class: cxhs
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                cxsa cxsaVar = this.a;
                avcq avcqVar = (avcq) cxsaVar.aM.b();
                auvw.k(avcqVar.a, null, null, new avcp(avcqVar, null), 3);
                ((dakl) cxsaVar.Y.b()).j("Scheduling immediate contacts import");
            }
        }, optional);
        k(subMenuAddSubMenu3, "Force sync work contacts data", new cxrw() { // from class: cxht
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                String str;
                final fcza fczaVar = avln.c;
                fcub fcubVar = (fcub) fczaVar;
                CharSequence[] charSequenceArr = new CharSequence[fcubVar.a()];
                for (int i = 0; i < fcubVar.a(); i++) {
                    int iOrdinal = ((avln) fczaVar.get(i)).ordinal();
                    if (iOrdinal == 0) {
                        str = "Full";
                    } else {
                        if (iOrdinal != 1) {
                            throw null;
                        }
                        str = "Incremental";
                    }
                    charSequenceArr[i] = str;
                }
                final cxsa cxsaVar = this.a;
                new AlertDialog.Builder(cyfvVar.a).setTitle("Sync Type:").setSingleChoiceItems(charSequenceArr, -1, new DialogInterface.OnClickListener() { // from class: cxoi
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        avln avlnVar = (avln) fczaVar.get(i2);
                        final cxsa cxsaVar2 = cxsaVar;
                        avlp avlpVar = (avlp) cxsaVar2.bi.b();
                        avlnVar.getClass();
                        eiju eijuVarC = auvw.c(avlpVar.a, fcyi.a, fdjz.a, new avlo(avlpVar, avlnVar, null));
                        ejvr ejvrVar = new ejvr() { // from class: cxrf
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj) {
                                cxsa cxsaVar3 = cxsaVar2;
                                ((cgbn) cxsaVar3.e.b()).W(emgm.DEBUG_ISSUE, cxsaVar3.x.getString(com.google.android.apps.messaging.R.string.report_contact_sync_issue));
                                return false;
                            }
                        };
                        eoqg eoqgVar = eoqg.a;
                        auvh.i(eijuVarC.e(Throwable.class, ejvrVar, eoqgVar), new Consumer() { // from class: cxcm
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void z(Object obj) {
                                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                                cxsa cxsaVar3 = cxsaVar2;
                                if (zBooleanValue) {
                                    cxsaVar3.s("Work contacts sync finished.");
                                } else {
                                    cxsaVar3.s("Sync failed to start. See go/am-work-contacts-sync.");
                                }
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        }, eoqgVar);
                        dialogInterface.dismiss();
                    }
                }).setCancelable(true).show();
            }
        }, optional);
        if (!cqbe.g()) {
            k(subMenuAddSubMenu3, "Force birthday sync from contacts", new cxrw() { // from class: cxhv
                @Override // defpackage.cxrw
                public final void a(cyfv cyfvVar) {
                    cxsa cxsaVar = this.a;
                    Optional optional2 = (Optional) ((eyig) cxsaVar.aw).a;
                    if (optional2.isPresent()) {
                        ((agme) optional2.get()).a();
                    } else {
                        ((dakl) cxsaVar.Y.b()).j("Birthday Sync is not available in this build");
                    }
                }
            }, optional);
        }
        k(subMenuAddSubMenu3, "Reset reactions promo", new cxrw() { // from class: cxhw
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                ejvr ejvrVar = new ejvr() { // from class: cxnh
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        umq umqVar = (umq) obj;
                        ekrg ekrgVar = cxsa.c;
                        ump umpVar = (ump) umqVar.toBuilder();
                        umpVar.copyOnWrite();
                        umq umqVar2 = (umq) umpVar.instance;
                        umqVar2.b |= 4;
                        umqVar2.e = false;
                        umpVar.copyOnWrite();
                        umq umqVar3 = (umq) umpVar.instance;
                        umqVar3.b |= 2;
                        umqVar3.d = 0;
                        boolean z2 = !umqVar.c;
                        umpVar.copyOnWrite();
                        umq umqVar4 = (umq) umpVar.instance;
                        umqVar4.b |= 1;
                        umqVar4.c = z2;
                        return (umq) umpVar.build();
                    }
                };
                final cxsa cxsaVar = this.a;
                cxsaVar.as.j(ejvrVar).k(auvh.c(new Consumer() { // from class: cxni
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        cxsaVar.t("Promo is reset.".concat(true != ((umq) obj).c ? "" : "  EXISTING REACTTIONS IGNORED"));
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                }), eoqg.a);
            }
        }, optional);
        if (((Optional) this.at.b()).isPresent()) {
            k(subMenuAddSubMenu3, "Reset double tap to react promo", new cxrw() { // from class: cxhx
                @Override // defpackage.cxrw
                public final void a(cyfv cyfvVar) {
                    ((Optional) this.a.at.b()).ifPresent(new Consumer() { // from class: cxlk
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void z(Object obj) {
                            ekrg ekrgVar = cxsa.c;
                            zbe zbeVar = (zbe) ((zbh) obj).a.b();
                            auvw.k(zbeVar.a, null, null, new zbb(zbeVar, null), 3);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                }
            }, optional);
        }
        if (cqbe.d() || cqbe.i()) {
            k(subMenuAddSubMenu3, "Trigger MMS group upgrade", new cxrw() { // from class: cxhy
                @Override // defpackage.cxrw
                public final void a(cyfv cyfvVar) {
                    final cxsa cxsaVar = this.a;
                    ((dakl) cxsaVar.Y.b()).j("Starting MMS group upgrade batch");
                    cinr cinrVar = (cinr) cxsaVar.aY.b();
                    auvh.h(auvw.c(cinrVar.b, fcyi.a, fdjz.a, new cinq(cinrVar, null)).h(new ejvr() { // from class: cxow
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj) {
                            Integer num = (Integer) obj;
                            dakl daklVar = (dakl) cxsaVar.Y.b();
                            Objects.toString(num);
                            daklVar.j(String.valueOf(num).concat(" groups have been upgraded"));
                            return null;
                        }
                    }, cxsaVar.I));
                }
            }, optional);
        }
        if (cqbe.d()) {
            k(subMenuAddSubMenu3, "Trigger repair forked MMS groups", new cxrw() { // from class: cxhz
                @Override // defpackage.cxrw
                public final void a(cyfv cyfvVar) {
                    final cxsa cxsaVar = this.a;
                    ((dakl) cxsaVar.Y.b()).j("Starting repair forked MMS groups");
                    auvh.h(eijx.h(new eooy() { // from class: cxlx
                        @Override // defpackage.eooy
                        public final ListenableFuture a() throws IOException {
                            ciqt ciqtVar = (ciqt) cxsaVar.aZ.b();
                            eieu eieuVarH = eiiy.h("RepairForkedMmsGroupSynclet#syncOnForeground");
                            try {
                                eiju eijuVarC = auvw.c(ciqtVar.b, fcyi.a, fdjz.a, new ciqs(ciqtVar, null));
                                fczl.a(eieuVarH, null);
                                return eijuVarC;
                            } finally {
                            }
                        }
                    }, cxsaVar.af));
                }
            }, optional);
        }
        if (!cqbe.g() && ((ardl) this.bB.b()).a()) {
            k(subMenuAddSubMenu3, "Trigger force RCS group sync", new cxrw() { // from class: cxia
                @Override // defpackage.cxrw
                public final void a(final cyfv cyfvVar) {
                    final cxsa cxsaVar = this.a;
                    cxsaVar.s("Starting sync for RCS groups");
                    auvh.h(eijx.h(new eooy() { // from class: cxod
                        @Override // defpackage.eooy
                        public final ListenableFuture a() {
                            awpo awpoVar = (awpo) cxsaVar.bj.b();
                            return auvw.c(awpoVar.b, fcyi.a, fdjz.a, new awox(awpoVar, null));
                        }
                    }, cxsaVar.af).h(new ejvr() { // from class: cxoe
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj) {
                            awow awowVar = (awow) obj;
                            ekrw ekrwVarH = cxsa.c.h();
                            ekrwVarH.X(eksq.a, "Bugle");
                            ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/ui/debug/DebugUtilsImpl", "triggerForceRcsGroupSync", 4670, "DebugUtilsImpl.java")).t("Force group sync result: %s", awowVar.a());
                            Activity activity = cyfvVar.a;
                            ((ClipboardManager) activity.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("RCS group sync result", awowVar.a()));
                            new AlertDialog.Builder(activity).setTitle("RCS group sync result").setMessage(awowVar.a()).setCancelable(true).show();
                            java.util.Collection<Map> collectionValues = awowVar.b().values();
                            if ((collectionValues instanceof java.util.Collection) && collectionValues.isEmpty()) {
                                return null;
                            }
                            for (Map map : collectionValues) {
                                if (map.containsKey(awos.d) || map.containsKey(awos.e)) {
                                    cxsa cxsaVar2 = cxsaVar;
                                    ((cgbn) cxsaVar2.e.b()).W(emgm.DEBUG_ISSUE, cxsaVar2.x.getString(com.google.android.apps.messaging.R.string.rcs_group_sync_issue));
                                    return null;
                                }
                            }
                            return null;
                        }
                    }, cxsaVar.I));
                }
            }, optional);
        }
        k(subMenuAddSubMenu3, "Trigger dangling MMS parts cleanup", new cxrw() { // from class: cxic
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                final AlertDialog.Builder builder = new AlertDialog.Builder(cyfvVar.a);
                cxsa cxsaVar = this.a;
                final ListenableFuture listenableFutureF = ((egxv) cxsaVar.ay.b()).f(Telephony.MmsSms.CONTENT_URI, new Bundle());
                eijx.m(listenableFutureF).a(new Callable() { // from class: cxno
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        ekrg ekrgVar = cxsa.c;
                        Bundle bundle = (Bundle) eork.q(listenableFutureF);
                        StringBuilder sb = new StringBuilder();
                        if (bundle == null) {
                            sb.append("NULL bundle result. Requires sdk U+");
                        } else {
                            sb.append("Number of part files: ");
                            sb.append(bundle.getInt("part_file_count"));
                            sb.append("\nNumber of MMS parts: ");
                            sb.append(bundle.getInt("part_table_entry_count"));
                            sb.append("\nNumber of dangling files to delete: ");
                            sb.append(bundle.getInt("deleted_count"));
                            sb.append("\n");
                        }
                        AlertDialog.Builder builder2 = builder;
                        builder2.setTitle("Dangling MMS Parts Results");
                        builder2.setMessage(sb.toString());
                        builder2.setNegativeButton("Close", new DialogInterface.OnClickListener() { // from class: cxkf
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                ekrg ekrgVar2 = cxsa.c;
                                dialogInterface.dismiss();
                            }
                        });
                        ekrw ekrwVarE = cxsa.c.e();
                        ekrwVarE.X(eksq.a, "Bugle");
                        ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/ui/debug/DebugUtilsImpl", "actionDanglingMmsPartsCleanup", 2857, "DebugUtilsImpl.java")).t("Dangling MMS Parts Results: %s", sb);
                        return null;
                    }
                }, cxsaVar.af).h(new ejvr() { // from class: cxnp
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        ekrg ekrgVar = cxsa.c;
                        builder.create().show();
                        return null;
                    }
                }, cxsaVar.I);
            }
        }, optional);
        k(subMenuAddSubMenu3, true != ((cqjy) fcsuVar.b()).h ? "Immediately \"go foreground\" on AsyncBroadcastReceivers" : "Restore \"go foreground\" timer on AsyncBroadcastReceivers", new cxrw() { // from class: cxid
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                boolean zBooleanValue = ((Boolean) cqjy.b.e()).booleanValue();
                final cxsa cxsaVar = this.a;
                final Activity activity = cyfvVar.a;
                if (zBooleanValue) {
                    cxsaVar.o(activity, "enableGoForegroundImmediately", Boolean.toString(!((cqjy) cxsaVar.U.b()).h), new Runnable() { // from class: cxll
                        @Override // java.lang.Runnable
                        public final void run() {
                            ((cqjy) cxsaVar.U.b()).o();
                            cxsa.r(activity);
                        }
                    }, null, null);
                } else {
                    ((cqjy) cxsaVar.U.b()).o();
                    cxsa.r(activity);
                }
            }
        }, optional);
        k(subMenuAddSubMenu3, "Conversation Participants History", new cxrw() { // from class: cxie
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r19v0, types: [java.lang.String] */
            /* JADX WARN: Type inference failed for: r19v1 */
            /* JADX WARN: Type inference failed for: r19v10 */
            /* JADX WARN: Type inference failed for: r19v11 */
            /* JADX WARN: Type inference failed for: r19v12 */
            /* JADX WARN: Type inference failed for: r19v2 */
            /* JADX WARN: Type inference failed for: r19v4 */
            /* JADX WARN: Type inference failed for: r19v5 */
            /* JADX WARN: Type inference failed for: r19v6 */
            /* JADX WARN: Type inference failed for: r19v7 */
            /* JADX WARN: Type inference failed for: r19v8 */
            /* JADX WARN: Type inference failed for: r19v9 */
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                java.util.Collection collection;
                ekgb ekgbVarG;
                final Activity activity;
                eonr eonrVar;
                final ConversationIdType conversationIdType = (ConversationIdType) cyfvVar.b.map(new cxiq()).orElse(cxsa.f());
                boai boaiVarA = boal.a();
                boaiVarA.A("actionGetConversationsPartAuditLogTable");
                boaiVarA.c(new Function() { // from class: cxjk
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        boak boakVar = (boak) obj;
                        ekrg ekrgVar = cxsa.c;
                        boakVar.b(conversationIdType);
                        return boakVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                ekgb ekgbVarZ = boaiVarA.b().z();
                final Set set = (Set) Collection.EL.stream(ekgbVarZ).map(new Function() { // from class: cxjr
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        ekrg ekrgVar = cxsa.c;
                        return Long.toString(((bnyv) obj).k());
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(ekcv.b);
                brva brvaVarA = brvd.a();
                brvaVarA.A("actionGetConversationsPartAuditLogTable");
                brsv[] brsvVarArr = cxsa.d;
                int iIntValue = brvd.c().intValue();
                int length = brsvVarArr.length;
                final cxsa cxsaVar = this.a;
                for (int i = 0; i < 9; i++) {
                    if (((Integer) brvd.b.getOrDefault(brsvVarArr[i].toString(), -1)).intValue() > iIntValue) {
                        dqru.x("columnReference.toString()", iIntValue);
                    }
                }
                brvaVarA.m(brsvVarArr);
                brvaVarA.k(new brvb((brvc) new Function() { // from class: cxjz
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        brvc brvcVar = (brvc) obj;
                        ekrg ekrgVar = cxsa.c;
                        brvcVar.ap(new dqpm("participants_audit_log.participant_id", 3, brvc.as(set), false));
                        return brvcVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }.apply(new brvc())));
                Stream map = Collection.EL.stream(brvaVarA.b().z()).map(new Function() { // from class: cxkj
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) throws NumberFormatException {
                        brov brovVar = (brov) obj;
                        brovVar.getClass();
                        brsu brsuVar = brvd.c;
                        String strB = cwzb.b(brsuVar.a);
                        brovVar.aA(3, "participant_id");
                        String strB2 = cwzb.b(brsuVar.i);
                        brovVar.aA(8, "normalized_destination");
                        String strB3 = cwzb.b(brsuVar.j);
                        brovVar.aA(9, "send_destination");
                        String strB4 = cwzb.b(brsuVar.k);
                        brovVar.aA(10, "display_destination");
                        String strB5 = cwzb.b(brsuVar.p);
                        brovVar.aA(15, "full_name");
                        Map mapG = fcwa.g(new fcti(strB, brovVar.d), new fcti(strB2, brovVar.i), new fcti(strB3, brovVar.j), new fcti(strB4, brovVar.k), new fcti(strB5, brovVar.p));
                        brovVar.aA(0, "_id");
                        String str = brovVar.a;
                        str.getClass();
                        long j = Long.parseLong(str);
                        brovVar.aA(1, "operation_datetime");
                        Instant instant = brovVar.b;
                        instant.getClass();
                        cwze cwzeVar = cwze.a;
                        brovVar.aA(2, "operation_type");
                        cwze cwzeVarA = cwzd.a(brovVar.c);
                        brovVar.aA(43, "last_modified_by_key");
                        bbaj bbajVar = brovVar.R;
                        bbajVar.getClass();
                        return new cwzc("participants_audit_log", j, instant, cwzeVarA, bbajVar, mapG);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                int i2 = ekgb.d;
                Collector collector = ekcv.a;
                ekgb ekgbVar = (ekgb) Stream.CC.concat(Collection.EL.stream((ekgb) map.collect(collector)), Collection.EL.stream((ekgb) Collection.EL.stream(ekgbVarZ).map(new Function() { // from class: cxku
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) throws NumberFormatException {
                        bnyv bnyvVar = (bnyv) obj;
                        bnyvVar.getClass();
                        bnzr bnzrVar = boal.b;
                        String strA = cwzb.a(bnzrVar.a);
                        bnyvVar.aA(3, "conversation_participants_id");
                        String strA2 = cwzb.a(bnzrVar.e);
                        bnyvVar.aA(4, "conversation_id");
                        Map mapG = fcwa.g(new fcti(strA, bnyvVar.d), new fcti(strA2, bnyvVar.e), new fcti(cwzb.a(bnzrVar.f), Long.valueOf(bnyvVar.k())));
                        bnyvVar.aA(0, "_id");
                        String str = bnyvVar.a;
                        str.getClass();
                        long j = Long.parseLong(str);
                        bnyvVar.aA(1, "operation_datetime");
                        Instant instant = bnyvVar.b;
                        instant.getClass();
                        cwze cwzeVar = cwze.a;
                        bnyvVar.aA(2, "operation_type");
                        cwze cwzeVarA = cwzd.a(bnyvVar.c);
                        bnyvVar.aA(8, "last_modified_by_key");
                        bbaj bbajVar = bnyvVar.i;
                        bbajVar.getClass();
                        return new cwzc("conversation_participants_audit_log", j, instant, cwzeVarA, bbajVar, mapG);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(collector))).sorted(Comparator.CC.comparing(new Function() { // from class: cxle
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((cwzc) obj).a;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                })).collect(collector);
                String str = "Export the csv for conversation id: " + conversationIdType + "\nWarning: The participant destinations in this file are accurate as of the time when this file was created, and are not necessarily the same as when the changes represented in this file occurred.";
                ekfw ekfwVar = new ekfw();
                ?? r19 = "last modified by key";
                String[] strArr = {"table name", "row id", "operation datetime", "operation datetime in local device", "operation type", "last modified by key", "row data", "\n"};
                StringWriter stringWriter = new StringWriter();
                try {
                    int i3 = eonr.d;
                    eonrVar = new eonr(stringWriter, eons.c);
                } catch (IOException e) {
                    e = e;
                    r19 = ekgbVar;
                }
                try {
                    try {
                        boolean z2 = true;
                        for (String strConcat : Arrays.asList((String[]) Arrays.copyOf(strArr, 8))) {
                            if (!z2) {
                                eonrVar.a.write(44);
                            }
                            Writer writer = eonrVar.a;
                            eonq eonqVar = eonrVar.c;
                            if (strConcat == null) {
                                strConcat = "";
                                r19 = ekgbVar;
                            } else if (strConcat.indexOf(34) != -1) {
                                int length2 = strConcat.length();
                                StringBuilder sb = new StringBuilder(length2 + length2 + 2);
                                sb.append('\"');
                                r19 = ekgbVar;
                                int i4 = 0;
                                while (true) {
                                    try {
                                        int iIndexOf = strConcat.indexOf(34, i4);
                                        if (iIndexOf == -1) {
                                            break;
                                        }
                                        int i5 = iIndexOf + 1;
                                        sb.append(strConcat.substring(i4, i5));
                                        sb.append('\"');
                                        i4 = i5;
                                    } catch (Throwable th) {
                                        th = th;
                                        Throwable th2 = th;
                                        try {
                                            throw th2;
                                        } catch (Throwable th3) {
                                            fczl.a(eonrVar, th2);
                                            throw th3;
                                        }
                                    }
                                }
                                sb.append(strConcat.substring(i4));
                                sb.append('\"');
                                strConcat = sb.toString();
                            } else {
                                r19 = ekgbVar;
                                if (!eonqVar.a.j(strConcat) || strConcat.indexOf(44) != -1) {
                                    strConcat = a.a(strConcat, "\"", "\"");
                                } else if (strConcat.indexOf(45) == 0 && strConcat.length() > 1) {
                                    int i6 = 1;
                                    while (i6 < strConcat.length() && !Character.isDigit(strConcat.charAt(i6)) && !eons.b.c(strConcat.charAt(i6))) {
                                        i6++;
                                    }
                                    if (i6 == strConcat.length() || (i6 > 1 && !ejve.b.c(strConcat.charAt(i6 - 1)))) {
                                        strConcat = " ".concat(strConcat);
                                    }
                                }
                            }
                            writer.write(strConcat);
                            ekgbVar = r19;
                            z2 = false;
                        }
                        r19 = ekgbVar;
                        eonrVar.a.write(eonrVar.b);
                        eonrVar.flush();
                        fczl.a(eonrVar, null);
                        collection = r19;
                    } catch (Throwable th4) {
                        th = th4;
                        r19 = ekgbVar;
                    }
                } catch (IOException e2) {
                    e = e2;
                    cqbd cqbdVarE = cwzl.a.e();
                    cqbdVarE.I("IOException converting audit log line to CSV");
                    cqbdVarE.s(e);
                    collection = r19;
                    String string = stringWriter.toString();
                    string.getClass();
                    ekfwVar.h(string);
                    ekfwVar.j((Iterable) Collection.EL.stream(collection).map(new Function() { // from class: cxln
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return ((cwzc) obj).toString();
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).collect(ekcv.a));
                    ekgbVarG = ekfwVar.g();
                    activity = cyfvVar.a;
                    final FileWriter fileWriter = new FileWriter(cbpu.e(activity, "conversation_participants_history.csv"));
                    try {
                        Iterable$EL.forEach(ekgbVarG, new Consumer() { // from class: cxly
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void z(Object obj) {
                                try {
                                    fileWriter.write(a.x((String) obj, "\n"));
                                } catch (IOException e3) {
                                    ((dakl) cxsaVar.Y.b()).j("Error writing to dump file: ".concat(String.valueOf(e3.getMessage())));
                                }
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                        fileWriter.close();
                        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                        builder.setTitle("Conversation Participants History").setMessage(str).setCancelable(true);
                        builder.setPositiveButton("Export", new DialogInterface.OnClickListener() { // from class: cxmh
                            public final /* synthetic */ String c = "conversation_participants_history.csv";

                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i7) throws IOException {
                                kxc kxcVar = new kxc(cxsaVar.x);
                                kxcVar.d("text/csv");
                                Activity activity2 = activity;
                                kxcVar.b(cbpu.d(activity2, this.c));
                                Intent intentA = kxcVar.a();
                                intentA.setFlags(1);
                                eiid.o(activity2, intentA);
                                dialogInterface.dismiss();
                            }
                        });
                        builder.setNegativeButton("Close", new DialogInterface.OnClickListener() { // from class: cxjb
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i7) {
                                ekrg ekrgVar = cxsa.c;
                                dialogInterface.dismiss();
                            }
                        });
                        builder.create().show();
                    } finally {
                    }
                }
                String string2 = stringWriter.toString();
                string2.getClass();
                ekfwVar.h(string2);
                ekfwVar.j((Iterable) Collection.EL.stream(collection).map(new Function() { // from class: cxln
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((cwzc) obj).toString();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(ekcv.a));
                ekgbVarG = ekfwVar.g();
                activity = cyfvVar.a;
                try {
                    final FileWriter fileWriter2 = new FileWriter(cbpu.e(activity, "conversation_participants_history.csv"));
                    Iterable$EL.forEach(ekgbVarG, new Consumer() { // from class: cxly
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void z(Object obj) {
                            try {
                                fileWriter2.write(a.x((String) obj, "\n"));
                            } catch (IOException e3) {
                                ((dakl) cxsaVar.Y.b()).j("Error writing to dump file: ".concat(String.valueOf(e3.getMessage())));
                            }
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                    fileWriter2.close();
                } catch (IOException e3) {
                    ((dakl) cxsaVar.Y.b()).j("Error writing to dump file: ".concat(String.valueOf(e3.getMessage())));
                }
                AlertDialog.Builder builder2 = new AlertDialog.Builder(activity);
                builder2.setTitle("Conversation Participants History").setMessage(str).setCancelable(true);
                builder2.setPositiveButton("Export", new DialogInterface.OnClickListener() { // from class: cxmh
                    public final /* synthetic */ String c = "conversation_participants_history.csv";

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i7) throws IOException {
                        kxc kxcVar = new kxc(cxsaVar.x);
                        kxcVar.d("text/csv");
                        Activity activity2 = activity;
                        kxcVar.b(cbpu.d(activity2, this.c));
                        Intent intentA = kxcVar.a();
                        intentA.setFlags(1);
                        eiid.o(activity2, intentA);
                        dialogInterface.dismiss();
                    }
                });
                builder2.setNegativeButton("Close", new DialogInterface.OnClickListener() { // from class: cxjb
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i7) {
                        ekrg ekrgVar = cxsa.c;
                        dialogInterface.dismiss();
                    }
                });
                builder2.create().show();
            }
        }, optional);
        k(subMenuAddSubMenu3, "Diagnostics", new cxrw() { // from class: cxig
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                ((aijh) this.a.u.b()).v(cyfvVar.a);
            }
        }, optional);
        SubMenu subMenuAddSubMenu4 = subMenuAddSubMenu3.addSubMenu("Notifications");
        k(subMenuAddSubMenu4, "Notification Channels...", new cxrw() { // from class: cxih
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                new cxrr(this.a, cyfvVar.a).e(new Void[0]);
            }
        }, optional);
        SubMenu subMenuAddSubMenu5 = subMenuAddSubMenu4.addSubMenu(cgbe.MESSAGE_FAILURE.H);
        k(subMenuAddSubMenu5, "Single Send Failure", new cxrw() { // from class: cxii
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                this.a.z(2, 1, 1, 1);
            }
        }, optional);
        k(subMenuAddSubMenu5, "Single Download Failure", new cxrw() { // from class: cxij
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                this.a.z(2, 2, 1, 1);
            }
        }, optional);
        k(subMenuAddSubMenu5, "Send Failures (Single Conv)", new cxrw() { // from class: cxik
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                this.a.z(2, 1, 2, 1);
            }
        }, optional);
        k(subMenuAddSubMenu5, "Download Failures (Single Conv)", new cxrw() { // from class: cxil
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                this.a.z(2, 2, 2, 1);
            }
        }, optional);
        k(subMenuAddSubMenu5, "Send Failures (Multi Conv)", new cxrw() { // from class: cxim
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                this.a.z(2, 1, 2, 2);
            }
        }, optional);
        k(subMenuAddSubMenu5, "Download Failures (Multi Conv)", new cxrw() { // from class: cxph
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                this.a.z(2, 2, 2, 2);
            }
        }, optional);
        if (((Boolean) cgcr.a.e()).booleanValue()) {
            k(subMenuAddSubMenu5, "Single RCS Delivery Failure", new cxrw() { // from class: cxpi
                @Override // defpackage.cxrw
                public final void a(cyfv cyfvVar) {
                    this.a.z(2, 3, 1, 1);
                }
            }, optional);
            k(subMenuAddSubMenu5, "RCS Delivery Failures (Single Conv)", new cxrw() { // from class: cxpj
                @Override // defpackage.cxrw
                public final void a(cyfv cyfvVar) {
                    this.a.z(2, 3, 2, 1);
                }
            }, optional);
            k(subMenuAddSubMenu5, "RCS Delivery Failures (Multi Conv)", new cxrw() { // from class: cxpk
                @Override // defpackage.cxrw
                public final void a(cyfv cyfvVar) {
                    this.a.z(2, 3, 2, 2);
                }
            }, optional);
        }
        k(subMenuAddSubMenu5, "Outgoing Emergency Message Failure", new cxrw() { // from class: cxpl
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                ((cgbn) this.a.e.b()).w(new ConversationIdType(1L), "911");
            }
        }, optional);
        k(subMenuAddSubMenu5, "Cancel message failure", new cxrw() { // from class: cxpm
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                this.a.z(1, 2, 0, 0);
            }
        }, optional);
        if (((Boolean) ((cczi) bm.get()).e()).booleanValue()) {
            k(subMenuAddSubMenu4, "Message is Stuck in Sending", new cxrw() { // from class: cxpn
                @Override // defpackage.cxrw
                public final void a(cyfv cyfvVar) {
                    ((cgbn) this.a.e.b()).A();
                }
            }, optional);
        }
        k(subMenuAddSubMenu4, cgbe.LOW_STORAGE_SPACE.H, new cxrw() { // from class: cxpo
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                ekrg ekrgVar = cxsa.c;
                Toast.makeText(cyfvVar.a, "This is a pre-O notification only", 1).show();
            }
        }, optional);
        k(subMenuAddSubMenu4, cgbe.EXHAUSTED_STORAGE_SPACE.H, new cxrw() { // from class: cxpq
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                ((cmxa) this.a.f.b()).a();
            }
        }, optional);
        k(subMenuAddSubMenu4, cgbe.SIM_STORAGE_FULL.H, new cxrw() { // from class: cxpr
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                ((cgbn) this.a.e.b()).z(-1, "simTitle");
            }
        }, optional);
        k(subMenuAddSubMenu4, cgbe.MEDIA_RESIZING.H, new cxrw() { // from class: cxpt
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                cxsa cxsaVar = this.a;
                ((cgbn) cxsaVar.e.b()).u(((ajsn) cxsaVar.ba.b()).a(new ConversationIdType(1L), null, false), 2, 3);
            }
        }, optional);
        k(subMenuAddSubMenu4, cgbe.INCOMING_MESSAGE_FOR_SECONDARY_USER.H, new cxrw() { // from class: cxpu
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                ((cgrg) this.a.aL.b()).a();
            }
        }, optional);
        k(subMenuAddSubMenu4, cgbe.DIAGNOSTICS_TOOL.H, new cxrw() { // from class: cxpv
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                ((cgbn) this.a.e.b()).r();
            }
        }, optional);
        k(subMenuAddSubMenu4, cgbe.INCOMING_MESSAGE.H, new cxrw() { // from class: cxpw
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                this.a.v(cyfvVar, false, false);
            }
        }, optional);
        k(subMenuAddSubMenu4, cgbe.FOREGROUND_SERVICE.H, new cxrw() { // from class: cxpx
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                ((cgbn) this.a.e.b()).s();
            }
        }, optional);
        k(subMenuAddSubMenu4, cgbe.CMS_SYNC_FOREGROUND_SERVICE.H, new cxrw() { // from class: cxpy
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                ((cgbn) this.a.e.b()).o();
            }
        }, optional);
        k(subMenuAddSubMenu4, cgbe.REPORT_ISSUE.H, new cxrw() { // from class: cxpz
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                cxsa cxsaVar = this.a;
                ((cgbn) cxsaVar.e.b()).W(emgm.DEBUG_ISSUE, cxsaVar.x.getString(com.google.android.apps.messaging.R.string.report_issue_notification_text));
            }
        }, optional);
        k(subMenuAddSubMenu4, "SMS Rejected", new cxrw() { // from class: cxqb
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                cxsa cxsaVar = this.a;
                ((cgbn) cxsaVar.e.b()).W(emgm.SMS_REJECTED, cxsaVar.x.getString(com.google.android.apps.messaging.R.string.report_receive_issue_notification_message));
            }
        }, optional);
        k(subMenuAddSubMenu4, cgbe.AUTOMOVED_SPAM.H, new cxrw() { // from class: cxqc
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                ((cgbn) this.a.e.b()).n();
            }
        }, optional);
        k(subMenuAddSubMenu4, cgbe.DASHER_DISABLED.H, new cxrw() { // from class: cxqe
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                ((cgbn) this.a.e.b()).q("test_receiver@gmail.com");
            }
        }, optional);
        k(subMenuAddSubMenu4, cgbe.PRIMARY_DEVICE_CHANGED_MD.H, new cxrw() { // from class: cxqf
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                ((cgbn) this.a.e.b()).K(cpyb.MULTI_DEVICE, 2);
            }
        }, optional);
        k(subMenuAddSubMenu4, cgbe.PRIMARY_DEVICE_CHANGED_BNR.H, new cxrw() { // from class: cxqg
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                ((cgbn) this.a.e.b()).K(cpyb.BACKUP_AND_RESTORE, 2);
            }
        }, optional);
        k(subMenuAddSubMenu4, cgbe.BACKUP_DELETED_MD.H, new cxrw() { // from class: cxqh
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                ((cgbn) this.a.e.b()).K(cpyb.MULTI_DEVICE, 3);
            }
        }, optional);
        k(subMenuAddSubMenu4, cgbe.BACKUP_DELETED_BNR.H, new cxrw() { // from class: cxqi
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                ((cgbn) this.a.e.b()).K(cpyb.BACKUP_AND_RESTORE, 3);
            }
        }, optional);
        k(subMenuAddSubMenu4, cgbe.UNSPECIFIED_PRIMARY_DEVICE_ENFORCEMENT_MD.H, new cxrw() { // from class: cxqj
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                ((cgbn) this.a.e.b()).K(cpyb.MULTI_DEVICE, 1);
            }
        }, optional);
        k(subMenuAddSubMenu4, cgbe.UNSPECIFIED_PRIMARY_DEVICE_ENFORCEMENT_BNR.H, new cxrw() { // from class: cxqk
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                ((cgbn) this.a.e.b()).K(cpyb.BACKUP_AND_RESTORE, 1);
            }
        }, optional);
        k(subMenuAddSubMenu4, cgbe.ACCOUNT_REMOVED.H, new cxrw() { // from class: cxql
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                ((cgbn) this.a.e.b()).m();
            }
        }, optional);
        k(subMenuAddSubMenu4, cgbe.CMS_VITAL_ERROR.H, new cxrw() { // from class: cxqm
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                if (cqbe.d()) {
                    ((cgbn) this.a.e.b()).p(new Intent());
                }
            }
        }, optional);
        k(subMenuAddSubMenu4, cgbe.RCS_NOT_DELIVERED.H, new cxrw() { // from class: cxqn
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                ((cgbn) this.a.e.b()).x();
            }
        }, optional);
        k(subMenuAddSubMenu4, cgbe.RCS_STILL_SENDING.H, new cxrw() { // from class: cxqp
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                ((cgbn) this.a.e.b()).y();
            }
        }, optional);
        k(subMenuAddSubMenu4, cgbe.GAIA_PAIRING_VERIFICATION.H, new cxrw() { // from class: cxqq
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                if (cqbe.d()) {
                    ((cgbn) this.a.e.b()).t();
                }
            }
        }, optional);
        if (((apve) this.bw.b()).a()) {
            k(subMenuAddSubMenu4, "In App Update For Restore Initial Warning", new cxrw() { // from class: cxqr
                @Override // defpackage.cxrw
                public final void a(cyfv cyfvVar) {
                    Context context = this.a.x;
                    cxsa.j(cyfvVar, qxq.a(context.getString(com.google.android.apps.messaging.R.string.update_to_restore_backup_warning_initial_dialog_title_v2), "7", 7), context.getText(com.google.android.apps.messaging.R.string.update_to_restore_backup_warning_initial_dialog_subtext_v2), context.getString(com.google.android.apps.messaging.R.string.update_to_restore_backup_warning_dialog_positive_button_caption_v2), context.getString(com.google.android.apps.messaging.R.string.update_to_restore_backup_warning_initial_dialog_negative_button_caption));
                }
            }, optional);
            k(subMenuAddSubMenu4, "In App Update For Restore Reprompt Warning", new cxrw() { // from class: cxqs
                @Override // defpackage.cxrw
                public final void a(cyfv cyfvVar) {
                    Context context = this.a.x;
                    cxsa.j(cyfvVar, context.getString(com.google.android.apps.messaging.R.string.update_to_restore_backup_warning_reprompt_dialog_title), context.getText(com.google.android.apps.messaging.R.string.update_to_restore_backup_warning_reprompt_dialog_subtext), context.getString(com.google.android.apps.messaging.R.string.update_to_restore_backup_warning_dialog_positive_button_caption_v2), context.getString(com.google.android.apps.messaging.R.string.update_to_restore_backup_warning_reprompt_dialog_negative_button_caption));
                }
            }, optional);
        }
        SubMenu subMenuAddSubMenu6 = menu.addSubMenu("Performance");
        k(subMenuAddSubMenu6, "Create message data for performance testing", new cxrw() { // from class: cxqt
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                final Activity activity = cyfvVar.a;
                AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                builder.setMessage("Create message data for performance testing?");
                builder.setNegativeButton("Close", new DialogInterface.OnClickListener() { // from class: cxoj
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        ekrg ekrgVar = cxsa.c;
                        dialogInterface.dismiss();
                    }
                });
                final cxsa cxsaVar = this.a;
                builder.setPositiveButton("Create", new eigf((eigp) cxsaVar.ao.b(), "com/google/android/apps/messaging/ui/debug/DebugUtilsImpl", "showCreateMessageDataForPerformanceTestingDialog", 4772, "DebugUtilsImpl#showCreateMessageDataForPerformanceTestingDialog", new DialogInterface.OnClickListener() { // from class: cxok
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        final cxsa cxsaVar2 = cxsaVar;
                        final Activity activity2 = activity;
                        auvh.h(eijx.f(new Runnable() { // from class: cxlh
                            /* JADX WARN: Removed duplicated region for block: B:61:0x01c3  */
                            /* JADX WARN: Removed duplicated region for block: B:62:0x01c5  */
                            /* JADX WARN: Removed duplicated region for block: B:65:0x01ca  */
                            /* JADX WARN: Removed duplicated region for block: B:92:0x01cb A[SYNTHETIC] */
                            @Override // java.lang.Runnable
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final void run() throws java.lang.InterruptedException {
                                /*
                                    Method dump skipped, instructions count: 584
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: defpackage.cxlh.run():void");
                            }
                        }, cxsaVar2.aR));
                    }
                }));
                builder.create().show();
            }
        }, optional);
        k(subMenuAddSubMenu6, "Create Fake Contacts", new cxrw() { // from class: cxqv
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                final cwzk cwzkVar = (cwzk) this.a.X.b();
                final Activity activity = cyfvVar.a;
                AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                builder.setMessage("Create contacts for performance testing?");
                builder.setNegativeButton("Close", new DialogInterface.OnClickListener() { // from class: cwzg
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                builder.setPositiveButton("Create", new eigf(cwzkVar.c, "com/google/android/apps/messaging/ui/debug/ContactManipulation", "createFakePerformanceContactsDialog", 218, "ContactManipulation#createFakePerformanceContactsDialog", new DialogInterface.OnClickListener() { // from class: cwzh
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        final Context applicationContext = activity.getApplicationContext();
                        final cwzk cwzkVar2 = cwzkVar;
                        Callable callable = new Callable() { // from class: cwzj
                            @Override // java.util.concurrent.Callable
                            public final Object call() throws RemoteException, OperationApplicationException {
                                Context context = applicationContext;
                                int i2 = 0;
                                while (i2 < 1500) {
                                    cwzk cwzkVar3 = cwzkVar2;
                                    Locale locale = Locale.US;
                                    Integer numValueOf = Integer.valueOf(i2);
                                    String str = String.format(locale, "FakePerfContact %04d", numValueOf);
                                    alqm alqmVarN = cwzkVar3.d.n(String.format(Locale.US, "555555%04d", numValueOf));
                                    ArrayList<ContentProviderOperation> arrayList = new ArrayList<>();
                                    arrayList.add(ContentProviderOperation.newInsert(ContactsContract.RawContacts.CONTENT_URI).withValue("account_type", null).withValue("account_name", null).build());
                                    ContentProviderOperation.Builder builderWithValue = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/phone_v2");
                                    cczv cczvVar = alvx.a;
                                    arrayList.add(builderWithValue.withValue("data1", alqmVarN.d(((Boolean) new alui().get()).booleanValue()).get()).withValue("data2", 2).build());
                                    arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/name").withValue("data1", str).build());
                                    try {
                                        context.getContentResolver().applyBatch("com.android.contacts", arrayList);
                                    } catch (Exception e) {
                                        cqca.h("Bugle", e, "createContactWithPhoneNumber caught");
                                        cwzkVar3.a.j("create contact " + String.valueOf(alqmVarN.d(((Boolean) new alui().get()).booleanValue())) + " caught " + e.toString());
                                    }
                                    i2++;
                                    cqca.m("Bugle", "Created contact %d of %d", Integer.valueOf(i2), 1500);
                                    if (i2 % 100 == 0) {
                                        cwzkVar3.a.j(a.e(i2, "Created contact ", " of 1500"));
                                    }
                                }
                                return null;
                            }
                        };
                        eosc eoscVar = cwzkVar2.e;
                        eijx.g(callable, eoscVar).h(new ejvr() { // from class: cwzf
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj) {
                                cwzkVar2.b.b();
                                return null;
                            }
                        }, eoscVar);
                    }
                }));
                builder.create().show();
            }
        }, optional);
        k(subMenuAddSubMenu6, "Delete Fake Contacts", new cxrw() { // from class: cxqw
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                final Activity activity = cyfvVar.a;
                AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                builder.setMessage("Delete contacts for performance testing?");
                builder.setNegativeButton("Close", new DialogInterface.OnClickListener() { // from class: cxmf
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        ekrg ekrgVar = cxsa.c;
                        dialogInterface.dismiss();
                    }
                });
                final cxsa cxsaVar = this.a;
                builder.setPositiveButton("Delete", new DialogInterface.OnClickListener() { // from class: cxmg
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        final cxsa cxsaVar2 = cxsaVar;
                        final cwzk cwzkVar = (cwzk) cxsaVar2.X.b();
                        final Context applicationContext = activity.getApplicationContext();
                        eijx.g(new Callable() { // from class: cwzi
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                Cursor cursorQuery;
                                String[] strArr = {"display_name", "lookup"};
                                Uri uri = ContactsContract.Data.CONTENT_URI;
                                String[] strArr2 = {"FakePerfContact%"};
                                Context context = applicationContext;
                                try {
                                    cursorQuery = context.getContentResolver().query(uri, strArr, "display_name LIKE ?", strArr2, null);
                                    try {
                                    } finally {
                                    }
                                } catch (RuntimeException e) {
                                    cwzk cwzkVar2 = cwzkVar;
                                    cqca.h("Bugle", e, "deleteContacts caught");
                                    cwzkVar2.a.j("delete contacts caught: ".concat(e.toString()));
                                }
                                if (cursorQuery == null) {
                                    throw new IllegalArgumentException("Given Uri could not be found in Contacts.");
                                }
                                while (cursorQuery.moveToNext()) {
                                    String string = cursorQuery.getString(0);
                                    context.getContentResolver().delete(Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_LOOKUP_URI, cursorQuery.getString(1)), null, null);
                                    cqca.l("Bugle", "Deleted contact " + string);
                                }
                                cursorQuery.close();
                                return null;
                            }
                        }, cwzkVar.e).h(new ejvr() { // from class: cxog
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj) {
                                ((bxjn) cxsaVar2.W.b()).b();
                                return null;
                            }
                        }, cxsaVar2.aR);
                    }
                });
                builder.create().show();
            }
        }, optional);
        k(subMenuAddSubMenu6, "Delete All Telephony Conversations", new cxrw() { // from class: cxqx
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                AlertDialog.Builder builder = new AlertDialog.Builder(cyfvVar.a);
                builder.setMessage("Delete all conversations?");
                builder.setNegativeButton("Close", new DialogInterface.OnClickListener() { // from class: cxhu
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        ekrg ekrgVar = cxsa.c;
                        dialogInterface.dismiss();
                    }
                });
                final cxsa cxsaVar = this.a;
                builder.setPositiveButton("Delete!", new DialogInterface.OnClickListener() { // from class: cxif
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        cxsa cxsaVar2 = cxsaVar;
                        try {
                            int iB = ((cmqj) cxsaVar2.p.b()).b(cxsaVar2.l.f().toEpochMilli());
                            if (((Boolean) ((cczi) cmqf.a.get()).e()).booleanValue()) {
                                ((cmqf) cxsaVar2.m.b()).l(enqq.DEBUG_UTILS_DELETE_ALL_CONVERSATIONS);
                            } else {
                                ((cmqf) cxsaVar2.m.b()).h();
                            }
                            ((dakl) cxsaVar2.Y.b()).j(a.D(iB, " messages deleted!  Synchronizing in background."));
                        } catch (Exception e) {
                            ((dakl) cxsaVar2.Y.b()).j("Error: ".concat(String.valueOf(e.getMessage())));
                        }
                    }
                });
                builder.create().show();
            }
        }, optional);
        k(subMenuAddSubMenu6, "Simulate UI Jank", new cxrw() { // from class: cxqy
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                cxsa cxsaVar = this.a;
                Optional optional2 = (Optional) ((eyig) cxsaVar.am).a;
                if (optional2.isPresent()) {
                    ((cyiy) optional2.get()).a();
                } else {
                    ((dakl) cxsaVar.Y.b()).j("UI Jank debug menu not available in this build");
                }
            }
        }, optional);
        SubMenu subMenuAddSubMenu7 = menu.addSubMenu("Values");
        k(subMenuAddSubMenu7, "Carrier Config...", new cxrw() { // from class: cxqz
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                ((aijh) this.a.u.b()).N(cyfvVar.a);
            }
        }, optional);
        k(subMenuAddSubMenu7, "Auto-ramp Overrides / GService keys...", new cxrw() { // from class: cxrb
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                ((aijh) this.a.u.b()).Q(cyfvVar.a);
            }
        }, optional);
        k(subMenuAddSubMenu7, "Phenotype flags", new cxrw() { // from class: cxrc
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                Window window = new AlertDialog.Builder(cyfvVar.a).setTitle("Phenotype flags").setMessage(((cczl) this.a.av.b()).b(true)).setCancelable(true).show().getWindow();
                window.getClass();
                window.setLayout(-1, -1);
            }
        }, optional);
        k(subMenuAddSubMenu7, "Auto-retrieve status", new cxrw() { // from class: cxrd
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                AlertDialog.Builder builder = new AlertDialog.Builder(cyfvVar.a);
                fcsu fcsuVar2 = this.a.A;
                AlertDialog.Builder title = builder.setTitle("Auto-retrieve status: " + ((cmuq) fcsuVar2.b()).c(-1));
                cmuq cmuqVar = (cmuq) fcsuVar2.b();
                cmuh cmuhVarA = cmuqVar.d.a(-1);
                cuuq cuuqVarB = cmuqVar.b(-1);
                boolean zBooleanValue = ((Boolean) cuuqVarB.c().orElse(Boolean.valueOf(cmuhVarA.n()))).booleanValue();
                boolean zBooleanValue2 = ((Boolean) cuuqVarB.d().orElse(Boolean.valueOf(cmuhVarA.o()))).booleanValue();
                title.setMessage("MMS auto download is enabled: " + zBooleanValue + "\nThe user is roaming: " + cmuqVar.e.h(-1).B() + "\nMMS auto download when roaming is enabled: " + zBooleanValue2 + "\n").setCancelable(true).show();
            }
        }, optional);
        k(subMenuAddSubMenu7, "Settings (Preferences)", new cxrw() { // from class: cxre
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                ((aijh) this.a.u.b()).P(cyfvVar.a);
            }
        }, optional);
        k(subMenuAddSubMenu7, "Primes", new cxrw() { // from class: cxcc
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                ekrg ekrgVar = cxsa.c;
                dzfv.a(cyfvVar.a);
            }
        }, optional);
        k(subMenuAddSubMenu7, "Message status DB size estimate", new cxrw() { // from class: cxcd
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                cxsa cxsaVar = this.a;
                final aiwu aiwuVar = (aiwu) cxsaVar.K.b();
                aiwuVar.getClass();
                Callable callable = new Callable() { // from class: cxlm
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return aiwuVar.b();
                    }
                };
                eosd eosdVar = cxsaVar.af;
                final eiju eijuVarG = eijx.g(callable, eosdVar);
                final aiwq aiwqVar = (aiwq) cxsaVar.L.b();
                aiwqVar.getClass();
                final eiju eijuVarG2 = eijx.g(new Callable() { // from class: cxlo
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return aiwqVar.b();
                    }
                }, eosdVar);
                eijz eijzVarD = eika.d(eijuVarG, eijuVarG2);
                final Activity activity = cyfvVar.a;
                auvh.h(eijzVarD.a(new Callable() { // from class: cxlp
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        ekrg ekrgVar = cxsa.c;
                        aiwv aiwvVar = (aiwv) eork.q(eijuVarG);
                        aiwv aiwvVar2 = (aiwv) eork.q(eijuVarG2);
                        new AlertDialog.Builder(activity).setTitle("Message Status DB Size").setMessage("message_status table:\n" + String.valueOf(aiwvVar) + "\n\nevents table:\n" + String.valueOf(aiwvVar2)).setCancelable(true).show();
                        return new Object();
                    }
                }, cxsaVar.I));
            }
        }, optional);
        k(subMenuAddSubMenu7, "Android Id", new cxrw() { // from class: cxce
            @Override // defpackage.cxrw
            public final void a(final cyfv cyfvVar) {
                final cxsa cxsaVar = this.a;
                auvh.i(eijx.g(new Callable() { // from class: cxox
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return Long.valueOf(devd.b(cxsaVar.x.getContentResolver(), "android_id", 0L));
                    }
                }, cxsaVar.af), new Consumer() { // from class: cxir
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        Long l = (Long) obj;
                        ((ClipboardManager) cyfvVar.a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("AndroidId", Long.toString(l.longValue())));
                        ((dakl) cxsaVar.Y.b()).j(a.h(l, "Android Id: ", "\n(Copied to Clipboard)"));
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                }, cxsaVar.I);
            }
        }, optional);
        SubMenu subMenuAddSubMenu8 = menu.addSubMenu("Failures");
        k(subMenuAddSubMenu8, true != ((cqjy) fcsuVar.b()).i ? "Emulate SMS temp failure" : "Stop emulating SMS temp failure", new cxrw() { // from class: cxcf
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                boolean zBooleanValue = ((Boolean) cqjy.b.e()).booleanValue();
                final cxsa cxsaVar = this.a;
                final Activity activity = cyfvVar.a;
                if (zBooleanValue) {
                    cxsaVar.o(activity, "enableSmsTempFailure", Boolean.toString(!((cqjy) cxsaVar.U.b()).i), new Runnable() { // from class: cxnb
                        @Override // java.lang.Runnable
                        public final void run() {
                            ((cqjy) cxsaVar.U.b()).j(!((cqjy) r0.b()).i);
                            cxsa.r(activity);
                        }
                    }, null, null);
                    return;
                }
                ((cqjy) cxsaVar.U.b()).j(!((cqjy) r9.b()).i);
                cxsa.r(activity);
            }
        }, optional);
        k(subMenuAddSubMenu8, true != ((cqjy) fcsuVar.b()).j ? "Emulate SMS perm failure" : "Stop emulation SMS perm failure", new cxrw() { // from class: cxcg
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                boolean zBooleanValue = ((Boolean) cqjy.b.e()).booleanValue();
                final cxsa cxsaVar = this.a;
                final Activity activity = cyfvVar.a;
                if (zBooleanValue) {
                    cxsaVar.o(activity, "enableSmsPermFailure", Boolean.toString(!((cqjy) cxsaVar.U.b()).j), new Runnable() { // from class: cxlw
                        @Override // java.lang.Runnable
                        public final void run() {
                            ((cqjy) cxsaVar.U.b()).h(!((cqjy) r0.b()).j);
                            cxsa.r(activity);
                        }
                    }, null, null);
                    return;
                }
                ((cqjy) cxsaVar.U.b()).h(!((cqjy) r9.b()).j);
                cxsa.r(activity);
            }
        }, optional);
        k(subMenuAddSubMenu8, true != ((cqjy) fcsuVar.b()).n ? "Emulate SMS perm failure when receiving send result" : "Stop emulation SMS perm failure when receiving send result", new cxrw() { // from class: cxch
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                boolean zBooleanValue = ((Boolean) cqjy.b.e()).booleanValue();
                final cxsa cxsaVar = this.a;
                final Activity activity = cyfvVar.a;
                if (zBooleanValue) {
                    cxsaVar.o(activity, "enableSmsPermFailureAfterSending", Boolean.toString(!((cqjy) cxsaVar.U.b()).n), new Runnable() { // from class: cxjq
                        @Override // java.lang.Runnable
                        public final void run() {
                            ((cqjy) cxsaVar.U.b()).i(!((cqjy) r0.b()).n);
                            cxsa.r(activity);
                        }
                    }, null, null);
                    return;
                }
                ((cqjy) cxsaVar.U.b()).i(!((cqjy) r9.b()).n);
                cxsa.r(activity);
            }
        }, optional);
        k(subMenuAddSubMenu8, true != ((cqjy) fcsuVar.b()).k ? "Emulate MMS send temp failure" : "Stop emulating MMS send temp failure", new cxrw() { // from class: cxcj
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                boolean zBooleanValue = ((Boolean) cqjy.b.e()).booleanValue();
                final cxsa cxsaVar = this.a;
                final Activity activity = cyfvVar.a;
                if (zBooleanValue) {
                    cxsaVar.o(activity, "enableMmsSendTempFailure", Boolean.toString(!((cqjy) cxsaVar.U.b()).k), new Runnable() { // from class: cxlj
                        @Override // java.lang.Runnable
                        public final void run() {
                            ((cqjy) cxsaVar.U.b()).g(!((cqjy) r0.b()).k);
                            cxsa.r(activity);
                        }
                    }, null, null);
                    return;
                }
                ((cqjy) cxsaVar.U.b()).g(!((cqjy) r9.b()).k);
                cxsa.r(activity);
            }
        }, optional);
        k(subMenuAddSubMenu8, true != ((cqjy) fcsuVar.b()).o ? "Emulate MMS perm failure when receiving send result" : "Stop emulation MMS perm failure when receiving send result", new cxrw() { // from class: cxck
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                boolean zBooleanValue = ((Boolean) cqjy.b.e()).booleanValue();
                final cxsa cxsaVar = this.a;
                final Activity activity = cyfvVar.a;
                if (zBooleanValue) {
                    cxsaVar.o(activity, "enableMmsPermFailureAfterSending", Boolean.toString(!((cqjy) cxsaVar.U.b()).o), new Runnable() { // from class: cxon
                        @Override // java.lang.Runnable
                        public final void run() {
                            ((cqjy) cxsaVar.U.b()).f(!((cqjy) r0.b()).o);
                            cxsa.r(activity);
                        }
                    }, null, null);
                    return;
                }
                ((cqjy) cxsaVar.U.b()).f(!((cqjy) r9.b()).o);
                cxsa.r(activity);
            }
        }, optional);
        k(subMenuAddSubMenu8, "Force MMS send result to status...", new cxrw() { // from class: cxcl
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                final CharSequence[] charSequenceArr = {"<Don't force any status>", "0 RESULT_OK", "1 unspecified error", "2 invalid APN error", "3 unable to connect error", "4 http failure", "5 io error", "6 retry error", "7 configuration error", "8 no data network"};
                final Activity activity = cyfvVar.a;
                AlertDialog.Builder title = new AlertDialog.Builder(activity).setTitle("Tap on desired status to force sent MMS to");
                boolean zBooleanValue = ((Boolean) cqjy.b.e()).booleanValue();
                final cxsa cxsaVar = this.a;
                title.setSingleChoiceItems(charSequenceArr, zBooleanValue ? ((cqjy) cxsaVar.U.b()).m + 1 : -1, new DialogInterface.OnClickListener() { // from class: cxnm
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(final DialogInterface dialogInterface, int i) throws NumberFormatException {
                        final cxsa cxsaVar2 = cxsaVar;
                        if (i == 0) {
                            if (!((Boolean) cqjy.b.e()).booleanValue()) {
                                ((cqjy) cxsaVar2.U.b()).d();
                                ((dakl) cxsaVar2.Y.b()).j("Won't force MMS send result status anymore");
                                return;
                            }
                            i = 0;
                        }
                        CharSequence charSequence = charSequenceArr[i];
                        final int i2 = Integer.parseInt((String) ekis.h(ejxk.b(' ').g(charSequence.toString()), 0));
                        String strConcat = i != 0 ? "Will force MMS send result status to ".concat(String.valueOf(String.valueOf(charSequence))) : "Won't force MMS send result status anymore";
                        if (((Boolean) cqjy.b.e()).booleanValue()) {
                            final Activity activity2 = activity;
                            cxsaVar2.o(activity2, "forceMmsSendResultStatusFailure", charSequence, i == 0 ? new Runnable() { // from class: cxlq
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ((cqjy) cxsaVar2.U.b()).d();
                                    cxsa.r(activity2);
                                }
                            } : new Runnable() { // from class: cxlr
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ((cqjy) cxsaVar2.U.b()).l(i2);
                                    cxsa.r(activity2);
                                }
                            }, new Runnable() { // from class: cxls
                                @Override // java.lang.Runnable
                                public final void run() {
                                    cxsa.r(activity2);
                                    dialogInterface.cancel();
                                }
                            }, strConcat);
                        } else {
                            ((cqjy) cxsaVar2.U.b()).l(i2);
                            ((dakl) cxsaVar2.Y.b()).j(strConcat);
                        }
                    }
                }).setCancelable(true).show();
            }
        }, optional);
        k(subMenuAddSubMenu8, "Force downloaded MMS to status...", new cxrw() { // from class: cxcn
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                final CharSequence[] charSequenceArr = new CharSequence[19];
                charSequenceArr[0] = "<Don't force any status>";
                int i = 100;
                int i2 = 1;
                while (i2 < 19) {
                    charSequenceArr[i2] = i + " " + avbn.a(i).replace("MESSAGE_STATUS_INCOMING_", "").replace("_", " ").toLowerCase(Locale.ENGLISH);
                    i2++;
                    i++;
                }
                final cxsa cxsaVar = this.a;
                final Activity activity = cyfvVar.a;
                new AlertDialog.Builder(activity).setTitle("Tap on desired status to force downloaded MMS to").setSingleChoiceItems(charSequenceArr, ((Boolean) cqjy.b.e()).booleanValue() ? ((cqjy) cxsaVar.U.b()).l - 99 : -1, new DialogInterface.OnClickListener() { // from class: cxjl
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(final DialogInterface dialogInterface, int i3) throws NumberFormatException {
                        final cxsa cxsaVar2 = cxsaVar;
                        if (i3 == 0) {
                            if (!((Boolean) cqjy.b.e()).booleanValue()) {
                                ((cqjy) cxsaVar2.U.b()).c();
                                ((dakl) cxsaVar2.Y.b()).j("Won't force any MMS status anymore");
                                return;
                            }
                            i3 = 0;
                        }
                        CharSequence charSequence = charSequenceArr[i3];
                        final int i4 = Integer.parseInt((String) ekis.h(ejxk.b(' ').g(charSequence.toString()), 0));
                        String strConcat = i3 != 0 ? "Will force new MMS messages to ".concat(String.valueOf(String.valueOf(charSequence))) : "Won't force any MMS status anymore";
                        if (((Boolean) cqjy.b.e()).booleanValue()) {
                            final Activity activity2 = activity;
                            cxsaVar2.o(activity2, "forceMmsDownloadStatusFailure", charSequence, i3 == 0 ? new Runnable() { // from class: cxiw
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ((cqjy) cxsaVar2.U.b()).c();
                                    cxsa.r(activity2);
                                }
                            } : new Runnable() { // from class: cxix
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ((cqjy) cxsaVar2.U.b()).k(i4);
                                    cxsa.r(activity2);
                                }
                            }, new Runnable() { // from class: cxiy
                                @Override // java.lang.Runnable
                                public final void run() {
                                    cxsa.r(activity2);
                                    dialogInterface.cancel();
                                }
                            }, strConcat);
                        } else {
                            ((cqjy) cxsaVar2.U.b()).k(i4);
                            ((dakl) cxsaVar2.Y.b()).j(strConcat);
                        }
                    }
                }).setCancelable(true).show();
            }
        }, optional);
        k(subMenuAddSubMenu8, "Expedite all retries", new cxrw() { // from class: cxco
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                ekrg ekrgVar = axxy.a;
                for (int i = 0; i < 8; i++) {
                    axxy.b(i, true);
                }
                ((aypv) this.a.ab.b()).a().z();
            }
        }, optional);
        long jLongValue = ((Long) MessageData.d.e()).longValue();
        long j = MessageData.b;
        k(subMenuAddSubMenu8, jLongValue == j ? "Shorten retry window timeout value" : "Reset retry window timeout value", new cxrw() { // from class: cxcp
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                Long lValueOf;
                Long lValueOf2;
                cczi ccziVar = MessageData.d;
                long jLongValue2 = ((Long) ccziVar.e()).longValue();
                long j2 = MessageData.b;
                if (jLongValue2 == j2) {
                    lValueOf = Long.valueOf(TimeUnit.SECONDS.toMillis(10L));
                    lValueOf2 = Long.valueOf(TimeUnit.SECONDS.toMillis(10L));
                } else {
                    lValueOf = Long.valueOf(j2);
                    lValueOf2 = Long.valueOf(MessageData.c);
                }
                cxsa cxsaVar = this.a;
                Activity activity = cyfvVar.a;
                cxsa.q(ccziVar, lValueOf);
                cxsa.q(MessageData.e, lValueOf2);
                ((dakl) cxsaVar.Y.b()).j(a.j(lValueOf2, lValueOf, "Zero connectivity timeout set to ", " ms; RCS resend and mark fail timeout set to ", " ms"));
                cxsa.r(activity);
            }
        }, optional);
        SubMenu subMenuAddSubMenu9 = menu.addSubMenu("RBM");
        fcsu fcsuVar2 = this.bn;
        final cxul cxulVar = (cxul) fcsuVar2.b();
        cxulVar.getClass();
        k(subMenuAddSubMenu9, "Reload chatbot information", new cxrw() { // from class: cxcq
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                ekrw ekrwVarH = cxul.a.h();
                ekrwVarH.X(eksq.a, "BugleRbm");
                ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/ui/debug/RbmDebugUtils", "reloadChatbotInformation", 72, "RbmDebugUtils.java")).q("Reloading chatbot information...");
                final cxul cxulVar2 = cxulVar;
                final asnl asnlVar = (asnl) cxulVar2.c.b();
                eijx.g(new Callable() { // from class: asli
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        bswc bswcVarA = bswf.a();
                        bswcVarA.A("getChatbotIdentifiersForDebuggingSync-rbm_business_info_properties");
                        bsvn[] bsvnVarArr = {bswf.c.b};
                        int iIntValue = bswf.c().intValue();
                        if (((Integer) bswf.b.getOrDefault(bsvnVarArr[0].toString(), -1)).intValue() > iIntValue) {
                            dqru.x("columnReference.toString()", iIntValue);
                        }
                        bswcVarA.m(bsvnVarArr);
                        return (ekhx) Collection.EL.stream(bswcVarA.b().z()).map(new Function() { // from class: aslr
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                bsuv bsuvVar = (bsuv) obj;
                                bsuvVar.aA(1, "rbm_bot_id");
                                return ejwk.b(bsuvVar.b);
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }).collect(ekcv.b);
                    }
                }, asnlVar.m.b).i(new eooz() { // from class: asmk
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        Stream stream = Collection.EL.stream((ekhx) obj);
                        final asnl asnlVar2 = asnlVar;
                        Stream map = stream.map(new Function() { // from class: asng
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                String str = (String) obj2;
                                ekrw ekrwVarH2 = asnl.b.h();
                                ekrwVarH2.X(eksq.a, "Bugle");
                                ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/apps/messaging/shared/business/RbmBusinessInfoDownloadHelper", "reloadChatbotForDebugging", 480, "RbmBusinessInfoDownloadHelper.java")).t("Reloading chatbot: %s", str);
                                return asnlVar2.j(new asnm(str, 6));
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        int i = ekgb.d;
                        final ekgb ekgbVar = (ekgb) map.collect(ekcv.a);
                        return eijx.j(ekgbVar).a(new Callable() { // from class: asnh
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                cqce cqceVar = asnl.a;
                                Stream map2 = Collection.EL.stream(ekgbVar).map(new Function() { // from class: asly
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo536andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj2) {
                                        eiju eijuVar = (eiju) obj2;
                                        cqce cqceVar2 = asnl.a;
                                        try {
                                            return (cbcw) eork.q(eijuVar);
                                        } catch (ExecutionException e) {
                                            return cbcw.l(e);
                                        }
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                                int i2 = ekgb.d;
                                return (ekgb) map2.collect(ekcv.a);
                            }
                        }, asnlVar2.h);
                    }
                }, asnlVar.g).k(auvh.c(new Consumer() { // from class: cxuk
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        ekgb ekgbVar = (ekgb) obj;
                        ekrw ekrwVarH2 = cxul.a.h();
                        ekrwVarH2.X(eksq.a, "BugleRbm");
                        ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/apps/messaging/ui/debug/RbmDebugUtils", "reloadChatbotInformation", 79, "RbmDebugUtils.java")).t("Reloaded chatbots: %s", ekgbVar);
                        StringBuilder sb = new StringBuilder();
                        Iterator<E> it3 = ekgbVar.iterator();
                        while (it3.hasNext()) {
                            Bundle bundleA = ((cbcw) it3.next()).a();
                            if (bundleA != null) {
                                sb.append(bundleA.getString("botId"));
                                sb.append("\n");
                            }
                        }
                        if (sb.length() > 300) {
                            sb.setLength(297);
                            sb.append("...");
                        }
                        ((dain) cxulVar2.e.b()).a("Reloaded chatbots:\n".concat(sb.toString()), false);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                }), cxulVar2.d);
            }
        }, optional);
        final cxul cxulVar2 = (cxul) fcsuVar2.b();
        cxulVar2.getClass();
        k(subMenuAddSubMenu9, "Trigger Retrieval Worker", new cxrw() { // from class: cxcr
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                cxul cxulVar3 = cxulVar2;
                String str = (String) cxulVar3.f.e();
                ekrw ekrwVarH = cxul.a.h();
                ekrwVarH.X(eksq.a, "BugleRbm");
                ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/ui/debug/RbmDebugUtils", "triggerBusinessInfoRetrievalWorker", 58, "RbmDebugUtils.java")).q("Why are you pressing this?");
                cavl cavlVar = (cavl) cxulVar3.b.b();
                cavh cavhVar = (cavh) cavk.a.createBuilder();
                cavhVar.copyOnWrite();
                cavk cavkVar = (cavk) cavhVar.instance;
                str.getClass();
                cavkVar.b = str;
                cavhVar.copyOnWrite();
                ((cavk) cavhVar.instance).c = cavi.a(4);
                cavhVar.copyOnWrite();
                ((cavk) cavhVar.instance).d = cavj.a(4);
                cavk cavkVar2 = (cavk) cavhVar.build();
                caxr caxrVar = new caxr();
                caxrVar.a = str;
                caxrVar.b = str;
                cavlVar.b(cavkVar2, caxrVar.a());
            }
        }, optional);
        if (((Boolean) ccze.i.e()).booleanValue()) {
            SubMenu subMenuAddSubMenu10 = menu.addSubMenu("Tachyon / Ditto");
            k(subMenuAddSubMenu10, "Register with internal FCM Authority", new cxrw() { // from class: cxcs
                @Override // defpackage.cxrw
                public final void a(final cyfv cyfvVar) {
                    final cxsa cxsaVar = this.a;
                    auvh.i(eijx.g(new Callable() { // from class: cxor
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            Optional optionalOfNullable = Optional.ofNullable(FirebaseInstanceId.b().h());
                            if (optionalOfNullable.isPresent()) {
                                return (String) optionalOfNullable.get();
                            }
                            return null;
                        }
                    }, cxsaVar.af), new Consumer() { // from class: cxos
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void z(Object obj) {
                            String str = (String) obj;
                            ((ClipboardManager) cyfvVar.a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("FCM Registration Token", str));
                            ((dakl) cxsaVar.Y.b()).j("FCM Registration Token: ".concat(String.valueOf(str)));
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    }, cxsaVar.I);
                }
            }, optional);
            k(subMenuAddSubMenu10, "Use debug Tachyon URL", new cxrw() { // from class: cxct
                @Override // defpackage.cxrw
                public final void a(cyfv cyfvVar) {
                    cxsa.q(cepb.b, "tachyon-playground-autopush-grpc.sandbox.googleapis.com:443");
                    cxsa cxsaVar = this.a;
                    ((dakl) cxsaVar.Y.b()).j("Tachyon URL: tachyon-playground-autopush-grpc.sandbox.googleapis.com:443");
                    auvh.h(((asep) cxsaVar.bl.b()).a() ? ((cedm) cxsaVar.o.b()).v() : ((ceuk) cxsaVar.R.b()).a());
                }
            }, optional);
            k(subMenuAddSubMenu10, "Reset Tachyon URL", new cxrw() { // from class: cxcv
                @Override // defpackage.cxrw
                public final void a(cyfv cyfvVar) {
                    cczi ccziVar = cepb.b;
                    cxsa.u(ccziVar);
                    cxsa cxsaVar = this.a;
                    ((dakl) cxsaVar.Y.b()).j("Tachyon URL: ".concat(String.valueOf((String) ccziVar.e())));
                    auvh.h(((asep) cxsaVar.bl.b()).a() ? ((cedm) cxsaVar.o.b()).v() : ((ceuk) cxsaVar.R.b()).a());
                }
            }, optional);
            k(subMenuAddSubMenu10, "Reset Tachyon token", new cxrw() { // from class: cxcw
                @Override // defpackage.cxrw
                public final void a(cyfv cyfvVar) {
                    cxsa cxsaVar = this.a;
                    auvh.h(((asep) cxsaVar.bl.b()).a() ? ((cedm) cxsaVar.o.b()).v() : ((ceuk) cxsaVar.R.b()).a());
                }
            }, optional);
            k(subMenuAddSubMenu10, "Set Tachyon token as expired", new cxrw() { // from class: cxcy
                @Override // defpackage.cxrw
                public final void a(cyfv cyfvVar) {
                    cxsa cxsaVar = this.a;
                    auvh.h(((asep) cxsaVar.bl.b()).a() ? ((cedm) cxsaVar.o.b()).z() : ((ceuk) cxsaVar.R.b()).d(0L));
                }
            }, optional);
            k(subMenuAddSubMenu10, "Register Anon with Tachyon", new cxrw() { // from class: cxcz
                @Override // defpackage.cxrw
                public final void a(cyfv cyfvVar) {
                    final cxsa cxsaVar = this.a;
                    final cfew cfewVar = (cfew) cxsaVar.G.b();
                    auvh.i(((ceuk) cxsaVar.R.b()).c().i(new eooz() { // from class: cxot
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj) {
                            ezpo ezpoVarA = ((cenj) cxsaVar.Z.b()).a("Bugle");
                            evqs evqsVarX = evqs.x((byte[]) obj);
                            ezpoVarA.copyOnWrite();
                            ezpp ezppVar = (ezpp) ezpoVarA.instance;
                            ezpp ezppVar2 = ezpp.a;
                            ezppVar.f = evqsVarX;
                            return cfewVar.c((ezpp) ezpoVarA.build());
                        }
                    }, cxsaVar.ae).i(new eooz() { // from class: cxou
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj) {
                            return cfew.n((cezv) cxsaVar.n.b(), (ezlf) obj);
                        }
                    }, cxsaVar.af), new Consumer() { // from class: cxov
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void z(Object obj) {
                            ekrw ekrwVarE = cxsa.c.e();
                            ekrwVarE.X(eksq.a, "Bugle");
                            ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/ui/debug/DebugUtilsImpl", "actionRegisterAnonymousWithTachyon", 3921, "DebugUtilsImpl.java")).q("Registered successfully with tachyon");
                            ((dakl) cxsaVar.Y.b()).j("Successfully refreshed tachyon registration");
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    }, eoqg.a);
                }
            }, optional);
            k(subMenuAddSubMenu10, "Refresh Anon Tachyon registration", new cxrw() { // from class: cxda
                @Override // defpackage.cxrw
                public final void a(cyfv cyfvVar) {
                    final cxsa cxsaVar = this.a;
                    auvh.i(((cedm) cxsaVar.o.b()).m(cedo.FORCE_REFRESH), new Consumer() { // from class: cxip
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void z(Object obj) {
                            ekrw ekrwVarE = cxsa.c.e();
                            ekrwVarE.X(eksq.a, "Bugle");
                            ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/ui/debug/DebugUtilsImpl", "actionRefreshAnonTachyonRegistration", 3931, "DebugUtilsImpl.java")).q("Successfully refreshed tachyon registration");
                            ((dakl) cxsaVar.Y.b()).j("Successfully refreshed tachyon registration");
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    }, eoqg.a);
                }
            }, optional);
            k(subMenuAddSubMenu10, "Clear Gaia Registration Token Expiration", new cxrw() { // from class: cxdb
                @Override // defpackage.cxrw
                public final void a(cyfv cyfvVar) {
                    final cxsa cxsaVar = this.a;
                    auvh.i(((cest) cxsaVar.bb.b()).j(0L), new Consumer() { // from class: cxhj
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void z(Object obj) {
                            ekrw ekrwVarE = cxsa.c.e();
                            ekrwVarE.X(eksq.a, "Bugle");
                            ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/ui/debug/DebugUtilsImpl", "actionClearGaiaRegistrationTokenExpiration", 3957, "DebugUtilsImpl.java")).q("Successfully cleared Gaia Registration Token Expiration");
                            ((dakl) cxsaVar.Y.b()).j("Successfully cleared Gaia Registration Token Expiration");
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    }, eoqg.a);
                }
            }, optional);
            k(subMenuAddSubMenu10, "Link RCS to Gaia Account", new cxrw() { // from class: cxdc
                /* JADX WARN: Type inference failed for: r0v1, types: [bvll, java.lang.Object] */
                @Override // defpackage.cxrw
                public final void a(cyfv cyfvVar) {
                    final cxsa cxsaVar = this.a;
                    Optional optional2 = cxsaVar.bg;
                    optional2.isPresent();
                    eiju eijuVarE = optional2.get().e();
                    eooz eoozVar = new eooz() { // from class: cxmd
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj) {
                            String str = (String) obj;
                            cedc cedcVar = (cedc) cxsaVar.bh.b();
                            str.getClass();
                            return auvw.c(cedcVar.a, fcyi.a, fdjz.a, new cecx(cedcVar, str, null));
                        }
                    };
                    eoqg eoqgVar = eoqg.a;
                    auvh.i(eijuVarE.i(eoozVar, eoqgVar), new Consumer() { // from class: cxme
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void z(Object obj) {
                            ekrw ekrwVarE = cxsa.c.e();
                            ekrwVarE.X(eksq.a, "Bugle");
                            ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/ui/debug/DebugUtilsImpl", "actionLinkGaiaAccount", 3948, "DebugUtilsImpl.java")).q("Successfully linked rcs phone number to current gaia account");
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    }, eoqgVar);
                }
            }, optional);
            k(subMenuAddSubMenu10, "Start anonymous bind handler", new cxrw() { // from class: cxdd
                @Override // defpackage.cxrw
                public final void a(cyfv cyfvVar) {
                    fcsu fcsuVar3 = this.a.z;
                    if (((Optional) fcsuVar3.b()).isPresent()) {
                        ((cfzf) ((Optional) fcsuVar3.b()).get()).d();
                    }
                }
            }, optional);
            k(subMenuAddSubMenu10, "Stop anonymous bind handler", new cxrw() { // from class: cxde
                @Override // defpackage.cxrw
                public final void a(cyfv cyfvVar) {
                    fcsu fcsuVar3 = this.a.z;
                    if (((Optional) fcsuVar3.b()).isPresent()) {
                        ((cfzf) ((Optional) fcsuVar3.b()).get()).g();
                    }
                }
            }, optional);
            k(subMenuAddSubMenu10, "challenge browser", new cxrw() { // from class: cxdf
                @Override // defpackage.cxrw
                public final void a(cyfv cyfvVar) {
                    cxsa cxsaVar = this.a;
                    byte[] bArrR = ((crqv) cxsaVar.q.b()).r("ditto_active_desktop_id");
                    if (bArrR == null) {
                        return;
                    }
                    try {
                        cfef cfefVarC = ((cfeh) cxsaVar.aa.b()).c((ezol) evsn.parseFrom(ezol.a, bArrR, evrr.a()), Optional.empty(), epby.GET_UPDATES);
                        eozc eozcVar = (eozc) eoze.a.createBuilder();
                        eovo eovoVar = eovo.a;
                        eozcVar.copyOnWrite();
                        eoze eozeVar = (eoze) eozcVar.instance;
                        eovoVar.getClass();
                        eozeVar.c = eovoVar;
                        eozeVar.b = 7;
                        cfefVarC.b(eozcVar.build());
                        ((cema) cxsaVar.y.b()).a(cfefVarC.a());
                    } catch (evtj e) {
                        ekrw ekrwVarI = cxsa.c.i();
                        ekrwVarI.X(eksq.a, "Bugle");
                        ((ekrd) ((ekrd) ((ekrd) ekrwVarI).g(e)).h("com/google/android/apps/messaging/ui/debug/DebugUtilsImpl", "actionChallengeBrowserHandler", (char) 3998, "DebugUtilsImpl.java")).q("Unable to parse browser id");
                    }
                }
            }, optional);
            k(subMenuAddSubMenu10, "Clear promo banner data", new cxrw() { // from class: cxdh
                @Override // defpackage.cxrw
                public final void a(cyfv cyfvVar) {
                    fcsu fcsuVar3 = this.a.q;
                    ((crqv) fcsuVar3.b()).h("ditto_has_seen_pairing_screen", false);
                    ((crqv) fcsuVar3.b()).j("ditto_prompt_dismissed_count", 0);
                    ((crqv) fcsuVar3.b()).k("ditto_last_dismissed_timestamp_ms", 0L);
                }
            }, optional);
            k(subMenuAddSubMenu10, "Clear desktop settings data", new cxrw() { // from class: cxdj
                @Override // defpackage.cxrw
                public final void a(cyfv cyfvVar) {
                    ((crqv) this.a.q.b()).i("ditto_desktop_settings", eoxc.a.toByteArray());
                }
            }, optional);
            k(subMenuAddSubMenu10, "Send browser inactive message", new cxrw() { // from class: cxdk
                @Override // defpackage.cxrw
                public final void a(cyfv cyfvVar) {
                    cxsa cxsaVar = this.a;
                    try {
                        fcsu fcsuVar3 = cxsaVar.q;
                        byte[] bArrR = ((crqv) fcsuVar3.b()).r("ditto_active_desktop_id");
                        bArrR.getClass();
                        auvh.h(((aypz) cxsaVar.ac.b()).e((ezol) evsn.parseFrom(ezol.a, bArrR, evrr.a()), (String) Optional.ofNullable(((crqv) fcsuVar3.b()).f("ditto_active_desktop_request_id", null)).orElse("")));
                    } catch (evtj e) {
                        ekrw ekrwVarI = cxsa.c.i();
                        ekrwVarI.X(eksq.a, "Bugle");
                        ((ekrd) ((ekrd) ((ekrd) ekrwVarI).g(e)).h("com/google/android/apps/messaging/ui/debug/DebugUtilsImpl", "actionSendBrowserInactive", (char) 4033, "DebugUtilsImpl.java")).q("Error unmarshalling the desktop Id");
                    }
                }
            }, optional);
            k(subMenuAddSubMenu10, "Register PhoneNum with Tachyon", new cxrw() { // from class: cxdl
                @Override // defpackage.cxrw
                public final void a(cyfv cyfvVar) {
                    final iy iyVar = (iy) cyfvVar.a;
                    this.a.w(iyVar, new Consumer() { // from class: cxmz
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void z(Object obj) {
                            ekrg ekrgVar = cxsa.c;
                            Bundle bundle = new Bundle();
                            bundle.putInt("effectiveSubId", ((crof) obj).a());
                            cyiz cyizVar = new cyiz();
                            cyizVar.at(bundle);
                            cyizVar.t(iyVar.a(), "DebugTachyonPhoneRegistrationFragmentPeer");
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                }
            }, optional);
            k(subMenuAddSubMenu10, "Refresh PhoneNum with Tachyon", new cxrw() { // from class: cxdm
                @Override // defpackage.cxrw
                public final void a(cyfv cyfvVar) {
                    final cxsa cxsaVar = this.a;
                    cxsaVar.w(cyfvVar.a, new Consumer() { // from class: cxjf
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void z(Object obj) {
                            final crof crofVar = (crof) obj;
                            final cxsa cxsaVar2 = cxsaVar;
                            eiju eijuVarG = eijx.g(new Callable() { // from class: cxex
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    return ((cejp) cxsaVar2.S.b()).d(crofVar.a());
                                }
                            }, cxsaVar2.af);
                            eooz eoozVar = new eooz() { // from class: cxfi
                                @Override // defpackage.eooz
                                public final ListenableFuture a(Object obj2) {
                                    return ((cejj) cxsaVar2.J.b()).b((String) obj2);
                                }
                            };
                            eoqg eoqgVar = eoqg.a;
                            auvh.i(eijuVarG.i(eoozVar, eoqgVar).i(new eooz() { // from class: cxfs
                                @Override // defpackage.eooz
                                public final ListenableFuture a(Object obj2) {
                                    ekrg ekrgVar = cxsa.c;
                                    return ((cejg) obj2).m(cedo.FORCE_REFRESH);
                                }
                            }, eoqgVar), new Consumer() { // from class: cxgc
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void z(Object obj2) {
                                    ekrw ekrwVarE = cxsa.c.e();
                                    ekrwVarE.X(eksq.a, "Bugle");
                                    ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/ui/debug/DebugUtilsImpl", "actionRefreshPhoneTachyonRegistration", 4077, "DebugUtilsImpl.java")).q("Successfully refreshed tachyon registration");
                                    ((dakl) cxsaVar2.Y.b()).j("Successfully refreshed tachyon registration");
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            }, eoqgVar);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                }
            }, optional);
            k(subMenuAddSubMenu10, "Enter registration code", new cxrw() { // from class: cxdn
                @Override // defpackage.cxrw
                public final void a(cyfv cyfvVar) {
                    final Activity activity = cyfvVar.a;
                    AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                    ScrollView scrollView = new ScrollView(activity);
                    LinearLayout linearLayout = new LinearLayout(activity);
                    scrollView.addView(linearLayout);
                    scrollView.setFillViewport(true);
                    linearLayout.setOrientation(1);
                    builder.setView(scrollView);
                    linearLayout.addView(cyfvVar.b("Enter registration code"));
                    final EditText editTextA = cyfvVar.a(2);
                    editTextA.setId(com.google.android.apps.messaging.R.id.tachyon_pin_edit_text);
                    editTextA.setFilters(new InputFilter[]{new InputFilter.LengthFilter(6)});
                    linearLayout.addView(editTextA);
                    TextView textViewB = cyfvVar.b("Result: None");
                    textViewB.setId(com.google.android.apps.messaging.R.id.tachyon_pin_result_text);
                    linearLayout.addView(textViewB);
                    final cxrl cxrlVar = new cxrl(textViewB);
                    builder.setPositiveButton("Verify", (DialogInterface.OnClickListener) null);
                    builder.setNegativeButton("Close", new DialogInterface.OnClickListener() { // from class: cxnw
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            ekrg ekrgVar = cxsa.c;
                            dialogInterface.dismiss();
                        }
                    });
                    AlertDialog alertDialogCreate = builder.create();
                    final cxsa cxsaVar = this.a;
                    alertDialogCreate.setOnShowListener(new DialogInterface.OnShowListener() { // from class: cxpe
                        @Override // android.content.DialogInterface.OnShowListener
                        public final void onShow(DialogInterface dialogInterface) {
                            Button button = ((AlertDialog) dialogInterface).getButton(-1);
                            final cxsa cxsaVar2 = cxsaVar;
                            final EditText editText = editTextA;
                            final Activity activity2 = activity;
                            final cxrz cxrzVar = cxrlVar;
                            button.setOnClickListener(new View.OnClickListener() { // from class: cxnu
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    final String string = editText.getText().toString();
                                    int length = string.length();
                                    final cxsa cxsaVar3 = cxsaVar2;
                                    if (length != 6) {
                                        ((dakl) cxsaVar3.Y.b()).j("Invalid PIN, enter 6 digits from verification SMS");
                                    } else {
                                        final cxrz cxrzVar2 = cxrzVar;
                                        cxsaVar3.w(activity2, new Consumer() { // from class: cxmy
                                            @Override // java.util.function.Consumer
                                            /* renamed from: accept */
                                            public final void z(Object obj) {
                                                cxsaVar3.y((crof) obj, string, cxrzVar2);
                                            }

                                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                                return Consumer$CC.$default$andThen(this, consumer);
                                            }
                                        });
                                    }
                                }
                            });
                        }
                    });
                    alertDialogCreate.show();
                }
            }, optional);
            k(subMenuAddSubMenu10, "Verify registration code", new cxrw() { // from class: cxdo
                @Override // defpackage.cxrw
                public final void a(cyfv cyfvVar) {
                    final cxsa cxsaVar = this.a;
                    cxsaVar.w(cyfvVar.a, new Consumer() { // from class: cxom
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void z(Object obj) {
                            crof crofVar = (crof) obj;
                            String str = (String) cefs.c.e();
                            boolean zIsEmpty = TextUtils.isEmpty(str);
                            cxsa cxsaVar2 = cxsaVar;
                            if (zIsEmpty) {
                                ((dakl) cxsaVar2.Y.b()).j("No configured PIN to verify");
                            } else {
                                cxsaVar2.y(crofVar, str, new cxrm(cxsaVar2, str));
                            }
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                }
            }, optional);
            k(subMenuAddSubMenu10, "Reset Tachyon phone token", new cxrw() { // from class: cxdp
                @Override // defpackage.cxrw
                public final void a(cyfv cyfvVar) {
                    ekrw ekrwVarE = cxsa.c.e();
                    ekrwVarE.X(eksq.a, "Bugle");
                    ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/ui/debug/DebugUtilsImpl", "actionResetTachyonPhoneToken", 4203, "DebugUtilsImpl.java")).q("Resetting Tachyon phone token");
                    final cxsa cxsaVar = this.a;
                    auvh.i(cxsaVar.i(), new Consumer() { // from class: cxiz
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void z(Object obj) {
                            ((dakl) cxsaVar.Y.b()).j("Removed the data");
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    }, cxsaVar.I);
                }
            }, optional);
            k(subMenuAddSubMenu10, "Unregister from Tachyon", new cxrw() { // from class: cxdq
                @Override // defpackage.cxrw
                public final void a(cyfv cyfvVar) {
                    final cxsa cxsaVar = this.a;
                    cxsaVar.w(cyfvVar.a, new Consumer() { // from class: cxpp
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void z(Object obj) {
                            final cxsa cxsaVar2 = cxsaVar;
                            final crof crofVar = (crof) obj;
                            auvh.i(cxsaVar2.i().i(new eooz() { // from class: cxjm
                                @Override // defpackage.eooz
                                public final ListenableFuture a(Object obj2) {
                                    cxsa cxsaVar3 = cxsaVar2;
                                    return ((cema) cxsaVar3.y.b()).a(new cfgv(cxsaVar3.g(crofVar)));
                                }
                            }, cxsaVar2.af), new Consumer() { // from class: cxjn
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void z(Object obj2) {
                                    ((dakl) cxsaVar2.Y.b()).j("Unregistered successfully from Tachyon");
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            }, cxsaVar2.I);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                }
            }, optional);
            k(subMenuAddSubMenu10, "Unregister Google RCS", new cxrw() { // from class: cxdr
                @Override // defpackage.cxrw
                public final void a(cyfv cyfvVar) {
                    final cxsa cxsaVar = this.a;
                    Stream map = Collection.EL.stream(((dggw) cxsaVar.aH.b()).o()).map(new cxkk()).map(new Function() { // from class: cxkl
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return ((cema) cxsaVar.y.b()).a(new cfgu((String) obj));
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    int i = ekgb.d;
                    eiju eijuVarC = eijx.j((Iterable) map.collect(ekcv.a)).c(new Runnable() { // from class: cxkm
                        @Override // java.lang.Runnable
                        public final void run() {
                            ekrg ekrgVar = cxsa.c;
                        }
                    }, cxsaVar.af);
                    ejvr ejvrVar = new ejvr() { // from class: cxkn
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj) {
                            ((dakl) cxsaVar.Y.b()).j("Unregistered Google RCS successfully");
                            return new Object();
                        }
                    };
                    eosc eoscVar = cxsaVar.I;
                    auvh.h(eijuVarC.h(ejvrVar, eoscVar).e(fbtf.class, new ejvr() { // from class: cxko
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj) {
                            ((dakl) cxsaVar.Y.b()).j("Failed to unregistered Google RCS");
                            ekrw ekrwVarI = cxsa.c.i();
                            ekrwVarI.X(eksq.a, "Bugle");
                            ((ekrd) ((ekrd) ((ekrd) ekrwVarI).g((fbtf) obj)).h("com/google/android/apps/messaging/ui/debug/DebugUtilsImpl", "actionUnregisterGoogleRcs", 4281, "DebugUtilsImpl.java")).q("Failed to unregistered Google RCS");
                            return new Object();
                        }
                    }, eoscVar));
                }
            }, optional);
            k(subMenuAddSubMenu10, "Start phone bind handler", new cxrw() { // from class: cxdu
                @Override // defpackage.cxrw
                public final void a(cyfv cyfvVar) {
                    final cxsa cxsaVar = this.a;
                    cxsaVar.w(cyfvVar.a, new Consumer() { // from class: cxkv
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void z(Object obj) {
                            crof crofVar = (crof) obj;
                            fcsu fcsuVar3 = cxsaVar.z;
                            if (((Optional) fcsuVar3.b()).isPresent()) {
                                ((cfzf) ((Optional) fcsuVar3.b()).get()).e(cxsa.A(crofVar));
                            }
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                }
            }, optional);
            k(subMenuAddSubMenu10, "Clear participant Tachyon data", new cxrw() { // from class: cxdv
                @Override // defpackage.cxrw
                public final void a(cyfv cyfvVar) {
                    Optional optional2 = cyfvVar.b;
                    if (optional2.isEmpty()) {
                        ((dakl) this.a.Y.b()).j("Failed to clear participant Tachyon data, is the conversation open?");
                    } else {
                        optional2.get();
                        throw null;
                    }
                }
            }, optional);
            final cxah cxahVar = this.an;
            k(subMenuAddSubMenu10, "Delete Scytale session", new cxrw() { // from class: cxdw
                @Override // defpackage.cxrw
                public final void a(cyfv cyfvVar) {
                    cxah cxahVar2 = cxahVar;
                    if (!((Boolean) cxahVar2.a.b()).booleanValue()) {
                        ((dakl) cxahVar2.b.b()).j("Disabled");
                        return;
                    }
                    Optional optional2 = cyfvVar.b;
                    if (optional2.isEmpty()) {
                        ((dakl) cxahVar2.b.b()).j("Failed to clear participant encryption session data, is the conversation open?");
                    } else {
                        optional2.get();
                        throw null;
                    }
                }
            }, optional);
            k(subMenuAddSubMenu10, "Clear local prekeys", new cxrw() { // from class: cxdx
                @Override // defpackage.cxrw
                public final void a(cyfv cyfvVar) {
                    final cxah cxahVar2 = cxahVar;
                    eiju eijuVarA = ((cejp) cxahVar2.c.b()).a();
                    final bvut bvutVar = (bvut) cxahVar2.d.b();
                    bvutVar.getClass();
                    eooz eoozVar = new eooz() { // from class: cxae
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj) {
                            return bvutVar.a((String) obj);
                        }
                    };
                    eosc eoscVar = cxahVar2.f;
                    auvh.i(eijuVarA.i(eoozVar, eoscVar), new Consumer() { // from class: cxaf
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void z(Object obj) {
                            ((dakl) cxahVar2.b.b()).j("Local prekeys cleared");
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    }, eoscVar);
                }
            }, optional);
            k(subMenuAddSubMenu10, "Upload prekeys", new cxrw() { // from class: cxdy
                @Override // defpackage.cxrw
                public final void a(cyfv cyfvVar) {
                    final cxah cxahVar2 = cxahVar;
                    eiju eijuVarA = ((cejp) cxahVar2.c.b()).a();
                    ejvr ejvrVar = new ejvr() { // from class: cxaa
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj) {
                            ((bvut) cxahVar2.d.b()).f((String) obj);
                            return null;
                        }
                    };
                    eosc eoscVar = cxahVar2.f;
                    auvh.i(eijuVarA.h(ejvrVar, eoscVar), new Consumer() { // from class: cxab
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void z(Object obj) {
                            ((dakl) cxahVar2.b.b()).j("Prekey upload scheduled");
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    }, eoscVar);
                }
            }, optional);
            k(subMenuAddSubMenu10, "Fork conversation", new cxrw() { // from class: cxdz
                @Override // defpackage.cxrw
                public final void a(cyfv cyfvVar) {
                    eiju eijuVarB = ((cwzr) this.a.az.b()).a.b("ConversationDebugOperations#forkLatestConversation", new Runnable() { // from class: cwzp
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.lang.Runnable
                        public final void run() {
                            botb botbVarE = botm.e();
                            botbVarE.A("forkLatestConversation-conversations");
                            botbVarE.i(new Function() { // from class: cwzm
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    botl botlVar = (botl) obj;
                                    botlVar.G();
                                    return botlVar;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            botbVarE.e(new bosy(botm.c.r, false));
                            botbVarE.y(1);
                            final bojh bojhVar = (bojh) botbVarE.b().m();
                            bojl bojlVarF = bojhVar.F();
                            String strA = bojhVar.C().a();
                            strA.getClass();
                            bojlVarF.B(barn.b(String.valueOf(Long.parseLong(strA) + 1)));
                            bojlVarF.f(null);
                            bojh bojhVarB = bojlVarF.b(new Supplier() { // from class: bojk
                                @Override // java.util.function.Supplier
                                public final Object get() {
                                    return new boji();
                                }
                            });
                            bojhVarB.D();
                            bojhVar.getClass();
                            bojhVarB.getClass();
                            String[] strArr = boiv.a;
                            boiq boiqVar = new boiq(boiv.a);
                            boiqVar.A("forkLatestConversation-conversation_participants");
                            boiqVar.f(new Function() { // from class: cwzq
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    boiu boiuVar = (boiu) obj;
                                    boiuVar.b(bojhVar.C());
                                    return boiuVar;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            ekqh it3 = boiqVar.b().z().iterator();
                            it3.getClass();
                            while (it3.hasNext()) {
                                bohq bohqVarP = ((bohm) it3.next()).p();
                                bohqVarP.c(bojhVarB.C());
                                bohm bohmVarB = bohqVarP.b(new Supplier() { // from class: bohp
                                    @Override // java.util.function.Supplier
                                    public final Object get() {
                                        return new bohn();
                                    }
                                });
                                final dqsy dqsyVarA = boiv.a();
                                dqru.b(boiv.a(), "conversation_to_participants", bohmVarB, new Function() { // from class: bohj
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo536andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj) {
                                        return Long.valueOf(dqsyVarA.P("conversation_to_participants", (dqst) obj));
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                }, new Consumer() { // from class: bohk
                                    @Override // java.util.function.Consumer
                                    /* renamed from: accept */
                                    public final void z(Object obj) {
                                    }

                                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                        return Consumer$CC.$default$andThen(this, consumer);
                                    }
                                });
                            }
                            brdr brdrVarD = MessagesTable.d();
                            brdrVarD.A("forkLatestConversation-messages");
                            brdrVarD.h(new Function() { // from class: cwzn
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    brec brecVar = (brec) obj;
                                    brecVar.m(bojhVar.C());
                                    int iIntValue = MessagesTable.g().intValue();
                                    if (iIntValue < 56000) {
                                        dqru.x("draft_id", iIntValue);
                                    }
                                    brecVar.ap(new dqpn("messages.draft_id", 5));
                                    return brecVar;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            brdrVarD.d(new brdo(MessagesTable.c.i, false));
                            brdrVarD.y(1);
                            final MessagesTable.BindData bindData = (MessagesTable.BindData) brdrVarD.b().m();
                            bquu bquuVarK = bindData.K();
                            bquuVarK.j(null);
                            bquuVarK.i(null);
                            bquuVarK.x(Optional.of(UUID.randomUUID()));
                            bquuVarK.m(bojhVarB.C());
                            MessagesTable.BindData bindDataC = bquuVarK.c();
                            bsje bsjeVarC = PartsTable.c();
                            bsjeVarC.A("forkLatestConversation-parts");
                            bsjeVarC.h(new Function() { // from class: cwzo
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    bsjl bsjlVar = (bsjl) obj;
                                    bsjlVar.n(bindData.E());
                                    return bsjlVar;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            ekqh it4 = bsjeVarC.b().z().iterator();
                            it4.getClass();
                            while (it4.hasNext()) {
                                bscl bsclVarW = ((PartsTable.BindData) it4.next()).w();
                                bsclVarW.J(bindDataC.E());
                                bsclVarW.d();
                            }
                        }
                    });
                    eijuVarB.getClass();
                    auvh.h(eijuVarB);
                }
            }, optional);
            if (cqbe.d() && abxb.a() && ((Boolean) ((cczi) bvfd.n.get()).e()).booleanValue()) {
                k(subMenuAddSubMenu10, "Keychain Pairing", new cxrw() { // from class: cxea
                    @Override // defpackage.cxrw
                    public final void a(cyfv cyfvVar) {
                        fcsu fcsuVar3 = this.a.aB;
                        if (((Optional) fcsuVar3.b()).isPresent()) {
                        }
                    }
                }, optional);
            }
            fcsu fcsuVar3 = this.bs;
            final cwzu cwzuVar = (cwzu) fcsuVar3.b();
            cwzuVar.getClass();
            k(subMenuAddSubMenu10, "Start Cronet NetLog", new cxrw() { // from class: cxeb
                @Override // defpackage.cxrw
                public final void a(cyfv cyfvVar) {
                    final cwzu cwzuVar2 = cwzuVar;
                    auvh.h(eijx.f(new Runnable() { // from class: cwzt
                        @Override // java.lang.Runnable
                        public final void run() {
                            cwzu cwzuVar3 = cwzuVar2;
                            try {
                                cwzuVar3.e = File.createTempFile("netlog-", ".json", cwzuVar3.b.getCacheDir());
                                ((ekrd) ((ekrd) cwzu.a.h()).h("com/google/android/apps/messaging/ui/debug/CronetDebugUtils", "startCronetNetLog", 55, "CronetDebugUtils.java")).t("Starting Cronet NetLog. Output file: %s", cwzuVar3.e);
                                ((CronetEngine) ((aghv) cwzuVar3.c.b()).a().get()).startNetLogToFile(cwzuVar3.e.toString(), true);
                            } catch (IOException e) {
                                ((ekrd) ((ekrd) ((ekrd) cwzu.a.j()).g(e)).h("com/google/android/apps/messaging/ui/debug/CronetDebugUtils", "startCronetNetLog", '4', "CronetDebugUtils.java")).q("Cannot start Cronet NetLog");
                            }
                        }
                    }, cwzuVar2.d));
                }
            }, optional);
            final cwzu cwzuVar2 = (cwzu) fcsuVar3.b();
            cwzuVar2.getClass();
            k(subMenuAddSubMenu10, "Stop Cronet NetLog", new cxrw() { // from class: cxec
                @Override // defpackage.cxrw
                public final void a(cyfv cyfvVar) {
                    final cwzu cwzuVar3 = cwzuVar2;
                    auvh.h(eijx.f(new Runnable() { // from class: cwzs
                        @Override // java.lang.Runnable
                        public final void run() {
                            ekrd ekrdVar = (ekrd) ((ekrd) cwzu.a.h()).h("com/google/android/apps/messaging/ui/debug/CronetDebugUtils", "stopCronetNetLog", 69, "CronetDebugUtils.java");
                            cwzu cwzuVar4 = cwzuVar3;
                            ekrdVar.t("Stopping Cronet NetLog. Output file: %s", cwzuVar4.e);
                            ((CronetEngine) ((aghv) cwzuVar4.c.b()).a().get()).stopNetLog();
                        }
                    }, cwzuVar3.d));
                }
            }, optional);
            if (((aprw) this.bC.b()).a()) {
                k(subMenuAddSubMenu10, "Show Self-identity", new cxrw() { // from class: cxed
                    @Override // defpackage.cxrw
                    public final void a(final cyfv cyfvVar) {
                        final StringBuilder sb = new StringBuilder(250);
                        cxsa cxsaVar = this.a;
                        eiju eijuVarI = ((aofc) cxsaVar.bk.b()).a().b().i(new eooz() { // from class: cxnc
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj) {
                                ekgb ekgbVar = (ekgb) obj;
                                ekrg ekrgVar = cxsa.c;
                                int size = ekgbVar.size();
                                int i = 0;
                                while (true) {
                                    StringBuilder sb2 = sb;
                                    if (i >= size) {
                                        return eijx.e(sb2.toString());
                                    }
                                    aoer aoerVar = (aoer) ekgbVar.get(i);
                                    if (!aoerVar.o().isEmpty()) {
                                        sb2.append("\n Display Name: ");
                                        sb2.append(aoerVar.q());
                                        sb2.append("\n SelfIdentity ID: ");
                                        sb2.append(aoerVar.h());
                                        sb2.append("\n LocalDestination: ");
                                        sb2.append(((alqm) aoerVar.o().get()).j());
                                        sb2.append("\n DisplayDestination: ");
                                        sb2.append(((alqm) aoerVar.o().get()).F());
                                        sb2.append("\n NormalizedDestination: ");
                                        sb2.append(((alqm) aoerVar.o().get()).l());
                                        sb2.append("\n");
                                    }
                                    i++;
                                }
                            }
                        }, cxsaVar.ae);
                        final Activity activity = cyfvVar.a;
                        auvh.i(eijuVarI, new Consumer() { // from class: cxki
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void z(Object obj) {
                                String str = (String) obj;
                                ekrg ekrgVar = cxsa.c;
                                ((ClipboardManager) cyfvVar.a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("User Self Identity", str));
                                new AlertDialog.Builder(activity).setTitle("User Self Identity").setMessage(str).setCancelable(true).show();
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        }, cxsaVar.I);
                    }
                }, optional);
            }
        }
        SubMenu subMenuAddSubMenu11 = menu.addSubMenu("MDD");
        k(subMenuAddSubMenu11, "Download now", new cxrw() { // from class: cxef
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                final cxsa cxsaVar = this.a;
                eiju eijuVarG = eiju.g(((cdte) cxsaVar.O.b()).d());
                ejvr ejvrVar = new ejvr() { // from class: cxpc
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        cxsa cxsaVar2 = cxsaVar;
                        ((cdur) cxsaVar2.s.b()).b(3, 2);
                        ((dakl) cxsaVar2.Y.b()).j("Download task handled.");
                        return new Object();
                    }
                };
                eoqg eoqgVar = eoqg.a;
                auvh.h(eijuVarG.h(ejvrVar, eoqgVar).e(Throwable.class, new ejvr() { // from class: cxpd
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        ((cdur) cxsaVar.s.b()).b(3, 3);
                        return new Object();
                    }
                }, eoqgVar));
            }
        }, optional);
        k(subMenuAddSubMenu11, "Dump MDD Debug", new cxrw() { // from class: cxeg
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                ekrw ekrwVarH = cxsa.c.h();
                ekrwVarH.X(eksq.a, "Bugle");
                ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/ui/debug/DebugUtilsImpl", "actionDumpMDDLibDebugInfo", 5145, "DebugUtilsImpl.java")).D("%s %s", "BugleMDD", ((cdte) this.a.O.b()).f());
            }
        }, optional);
        k(subMenuAddSubMenu11, "Advanced", new cxrw() { // from class: cxeh
            @Override // defpackage.cxrw
            public final void a(final cyfv cyfvVar) {
                ((cdte) this.a.O.b()).e(cyfvVar.a).ifPresent(new Consumer() { // from class: cxnq
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) throws IOException {
                        ekrg ekrgVar = cxsa.c;
                        eiid.o(cyfvVar.a, (Intent) obj);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
        }, optional);
        if (((Boolean) agnl.a.e()).booleanValue()) {
            k(menu.addSubMenu("Stickers"), true != ((Boolean) crbf.r.e()).booleanValue() ? "Enable sticker emotion debug" : "Disable sticker emotion debug", new cxrw() { // from class: cxei
                @Override // defpackage.cxrw
                public final void a(cyfv cyfvVar) {
                    ekrg ekrgVar = cxsa.c;
                    if (cqbe.d()) {
                        cxsa.q(crbf.r, Boolean.valueOf(!((Boolean) r2.e()).booleanValue()));
                    }
                }
            }, optional);
            final SubMenu subMenuAddSubMenu12 = menu.addSubMenu("OTP auto-delete");
            ((Optional) this.bq.b()).ifPresent(new Consumer() { // from class: cxej
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    final agnu agnuVar = (agnu) obj;
                    this.a.k(subMenuAddSubMenu12, "Reset OTP auto-delete states", new cxrw() { // from class: cxmp
                        @Override // defpackage.cxrw
                        public final void a(cyfv cyfvVar) {
                            ekrg ekrgVar = cxsa.c;
                            ejvr ejvrVar = new ejvr() { // from class: agnt
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj2) {
                                    agog agogVar = (agog) ((agoh) obj2).toBuilder();
                                    agogVar.copyOnWrite();
                                    ((agoh) agogVar.instance).c = false;
                                    agogVar.copyOnWrite();
                                    ((agoh) agogVar.instance).d = false;
                                    agogVar.copyOnWrite();
                                    ((agoh) agogVar.instance).b = 0;
                                    return (agoh) agogVar.build();
                                }
                            };
                            agnu agnuVar2 = agnuVar;
                            auvh.h(eiju.g(agnuVar2.b.b(ejvrVar, agnuVar2.a)));
                        }
                    }, optional);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        ((Optional) ((eyig) this.br).a).ifPresent(new Consumer() { // from class: cxek
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                final tiq tiqVar = (tiq) obj;
                SubMenu subMenuAddSubMenu13 = menu.addSubMenu("Spam");
                final cxsa cxsaVar = this.a;
                cxrw cxrwVar = new cxrw() { // from class: cxit
                    @Override // defpackage.cxrw
                    public final void a(cyfv cyfvVar) {
                        Activity activity = cyfvVar.a;
                        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                        ScrollView scrollView = new ScrollView(activity);
                        LinearLayout linearLayout = new LinearLayout(activity);
                        scrollView.addView(linearLayout);
                        scrollView.setFillViewport(true);
                        linearLayout.setOrientation(1);
                        builder.setView(scrollView);
                        linearLayout.addView(cyfvVar.b("Comma separated spammy phone numbers"));
                        final EditText editTextA = cyfvVar.a(1);
                        editTextA.setHint("+14445556666,+12223334444");
                        final cxsa cxsaVar2 = cxsaVar;
                        ekgb ekgbVarN = ekgb.n(((cqka) cxsaVar2.H.b()).a);
                        if (!ekgbVarN.isEmpty()) {
                            editTextA.setText(TextUtils.join(",", ekgbVarN));
                        }
                        linearLayout.addView(editTextA);
                        builder.setPositiveButton("Create", (DialogInterface.OnClickListener) null);
                        builder.setNegativeButton("Close", new DialogInterface.OnClickListener() { // from class: cxmq
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                ekrg ekrgVar = cxsa.c;
                                dialogInterface.dismiss();
                            }
                        });
                        AlertDialog alertDialogCreate = builder.create();
                        alertDialogCreate.setOnShowListener(new DialogInterface.OnShowListener() { // from class: cxmr
                            @Override // android.content.DialogInterface.OnShowListener
                            public final void onShow(final DialogInterface dialogInterface) {
                                Button button = ((AlertDialog) dialogInterface).getButton(-1);
                                final cxsa cxsaVar3 = cxsaVar2;
                                final EditText editText = editTextA;
                                button.setOnClickListener(new View.OnClickListener() { // from class: cxld
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        cxsa cxsaVar4 = cxsaVar3;
                                        fcsu fcsuVar4 = cxsaVar4.H;
                                        cqka cqkaVar = (cqka) fcsuVar4.b();
                                        int i = ekgb.d;
                                        cqkaVar.a(ekoe.a);
                                        String string = editText.getText().toString();
                                        if (!TextUtils.isEmpty(string)) {
                                            List listC = cssr.c(string);
                                            if (!listC.isEmpty()) {
                                                cqka cqkaVar2 = (cqka) fcsuVar4.b();
                                                Stream stream = Collection.EL.stream(listC);
                                                final alrj alrjVar = (alrj) cxsaVar4.ax.b();
                                                alrjVar.getClass();
                                                cqkaVar2.a((java.util.Collection) stream.map(new Function() { // from class: cxoo
                                                    @Override // java.util.function.Function
                                                    /* renamed from: andThen */
                                                    public final /* synthetic */ Function mo536andThen(Function function) {
                                                        return Function$CC.$default$andThen(this, function);
                                                    }

                                                    @Override // java.util.function.Function
                                                    public final Object apply(Object obj2) {
                                                        return alrjVar.n((String) obj2);
                                                    }

                                                    public final /* synthetic */ Function compose(Function function) {
                                                        return Function$CC.$default$compose(this, function);
                                                    }
                                                }).collect(ekcv.a));
                                            }
                                        }
                                        DialogInterface dialogInterface2 = dialogInterface;
                                        ((dakl) cxsaVar4.Y.b()).j("List updated to: ".concat(String.valueOf((String) Collection.EL.stream(ekgb.n(((cqka) fcsuVar4.b()).b)).map(new Function() { // from class: cxke
                                            @Override // java.util.function.Function
                                            /* renamed from: andThen */
                                            public final /* synthetic */ Function mo536andThen(Function function) {
                                                return Function$CC.$default$andThen(this, function);
                                            }

                                            @Override // java.util.function.Function
                                            public final Object apply(Object obj2) {
                                                ekrg ekrgVar = cxsa.c;
                                                return ejwk.b(((alqm) obj2).F().a);
                                            }

                                            public final /* synthetic */ Function compose(Function function) {
                                                return Function$CC.$default$compose(this, function);
                                            }
                                        }).collect(Collectors.joining(",")))));
                                        dialogInterface2.dismiss();
                                    }
                                });
                            }
                        });
                        alertDialogCreate.show();
                    }
                };
                Optional optional2 = optional;
                cxsaVar.k(subMenuAddSubMenu13, "Manage phone numbers with rcs spam warning...", cxrwVar, optional2);
                cxsaVar.k(subMenuAddSubMenu13, "Mark as detected spam", new cxrw() { // from class: cxiu
                    @Override // defpackage.cxrw
                    public final void a(cyfv cyfvVar) {
                        ekrg ekrgVar = cxsa.c;
                        tiqVar.a();
                    }
                }, optional2);
                cxsaVar.k(subMenuAddSubMenu13, "Reset spam status", new cxrw() { // from class: cxiv
                    @Override // defpackage.cxrw
                    public final void a(cyfv cyfvVar) {
                        ekrg ekrgVar = cxsa.c;
                        tiqVar.b();
                    }
                }, optional2);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        SubMenu subMenuAddSubMenu13 = menu.addSubMenu("Theme");
        if (((Boolean) ccze.ab.e()).booleanValue()) {
            k(subMenuAddSubMenu13, "Disable system font", new cxrw() { // from class: cxel
                @Override // defpackage.cxrw
                public final void a(cyfv cyfvVar) {
                    ekrg ekrgVar = cxsa.c;
                    cxsa.q(ccze.ab, false);
                    cyfvVar.a.recreate();
                }
            }, optional);
        } else {
            k(subMenuAddSubMenu13, "Enable system font", new cxrw() { // from class: cxem
                @Override // defpackage.cxrw
                public final void a(cyfv cyfvVar) {
                    ekrg ekrgVar = cxsa.c;
                    cxsa.q(ccze.ab, true);
                    cyfvVar.a.recreate();
                }
            }, optional);
        }
        final SubMenu subMenuAddSubMenu14 = menu.addSubMenu("Profiles");
        k(subMenuAddSubMenu14, "Conversation Profile Details", new cxrw() { // from class: cxen
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                final ConversationIdType conversationIdType = (ConversationIdType) cyfvVar.b.map(new cxiq()).orElse(cxsa.f());
                boai boaiVarA = boal.a();
                boaiVarA.A("actionGetConversationsPartAuditLogTable");
                boaiVarA.c(new Function() { // from class: cxkp
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        boak boakVar = (boak) obj;
                        ekrg ekrgVar = cxsa.c;
                        boakVar.b(conversationIdType);
                        return boakVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                final ekhx ekhxVar = (ekhx) Collection.EL.stream(boaiVarA.b().z()).map(new Function() { // from class: cxkq
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        ekrg ekrgVar = cxsa.c;
                        return Long.valueOf(((bnyv) obj).k());
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(ekcv.b);
                bsun bsunVarA = ProfilesTable.a();
                bsunVarA.A("actionGetConversationsProfilesTable");
                bsunVarA.e(new Function() { // from class: cxkr
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bsur bsurVar = (bsur) obj;
                        ekrg ekrgVar = cxsa.c;
                        bsurVar.ap(new dqpm("profiles_table.participant_id", 3, bsur.as(ekhxVar), true));
                        return bsurVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                Stream stream = Collection.EL.stream(bsunVarA.b().z());
                final cxsa cxsaVar = this.a;
                Stream map = stream.map(new Function() { // from class: cxks
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        ProfilesTable.BindData bindData = (ProfilesTable.BindData) obj;
                        return "Profile name: " + bindData.v() + "\nProfile number: " + bindData.z() + "\nProfile url: " + String.valueOf(bindData.q()) + "\nTime since last photo update (in minutes): " + Duration.ofMillis(cxsaVar.l.f().toEpochMilli() - bindData.p()).toMinutes();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                int i = ekgb.d;
                ekgb ekgbVar = (ekgb) map.collect(ekcv.a);
                AlertDialog.Builder title = new AlertDialog.Builder(cyfvVar.a).setTitle("Conversation Profile Details");
                StringBuilder sb = new StringBuilder();
                Iterator<E> it3 = ekgbVar.iterator();
                if (it3.hasNext()) {
                    while (true) {
                        sb.append((CharSequence) it3.next());
                        if (!it3.hasNext()) {
                            break;
                        } else {
                            sb.append((CharSequence) "\n\n");
                        }
                    }
                }
                title.setMessage(sb.toString()).setCancelable(true).show();
            }
        }, optional);
        k(subMenuAddSubMenu14, "Reset Shared Profile Tokens", new cxrw() { // from class: cxep
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                auvh.h(((anty) this.a.bf.b()).K(2));
            }
        }, optional);
        ((Optional) this.bx.b()).ifPresent(new Consumer() { // from class: cxer
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                final ctcm ctcmVar = (ctcm) obj;
                this.a.k(subMenuAddSubMenu14, "Reset Welcome Flow V1 state", new cxrw() { // from class: cxgd
                    @Override // defpackage.cxrw
                    public final void a(cyfv cyfvVar) {
                        ekrg ekrgVar = cxsa.c;
                        ctcmVar.k();
                    }
                }, optional);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        if (((Boolean) ((cczi) crbf.ak.get()).e()).booleanValue() && ((Optional) this.aE.b()).isPresent()) {
            k(menu.addSubMenu("Penpal conversation"), "Clean up Penpal bot", new cxrw() { // from class: cxes
                @Override // defpackage.cxrw
                public final void a(cyfv cyfvVar) {
                    final cxsa cxsaVar = this.a;
                    auvh.h(eijx.f(new Runnable() { // from class: cxnr
                        @Override // java.lang.Runnable
                        public final void run() {
                            final cxsa cxsaVar2 = cxsaVar;
                            ((cgte) ((Optional) cxsaVar2.aF.b()).get()).k();
                            boca bocaVarA = bocg.a();
                            bocaVarA.d(new Function() { // from class: cxoq
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    bocf bocfVar = (bocf) obj;
                                    bsbo bsboVarE = ParticipantsTable.e();
                                    final cxsa cxsaVar3 = cxsaVar2;
                                    bsboVarE.h(new Function() { // from class: cxof
                                        @Override // java.util.function.Function
                                        /* renamed from: andThen */
                                        public final /* synthetic */ Function mo536andThen(Function function) {
                                            return Function$CC.$default$andThen(this, function);
                                        }

                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj2) {
                                            bsbx bsbxVar = (bsbx) obj2;
                                            bsbxVar.r(((cgsa) ((Optional) cxsaVar3.aE.b()).get()).r());
                                            return bsbxVar;
                                        }

                                        public final /* synthetic */ Function compose(Function function) {
                                            return Function$CC.$default$compose(this, function);
                                        }
                                    });
                                    Stream map = Collection.EL.stream(bsboVarE.b().f()).map(new Function() { // from class: cxoh
                                        @Override // java.util.function.Function
                                        /* renamed from: andThen */
                                        public final /* synthetic */ Function mo536andThen(Function function) {
                                            return Function$CC.$default$andThen(this, function);
                                        }

                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj2) {
                                            return Long.valueOf(Long.parseLong((String) obj2));
                                        }

                                        public final /* synthetic */ Function compose(Function function) {
                                            return Function$CC.$default$compose(this, function);
                                        }
                                    });
                                    int i = ekgb.d;
                                    bocfVar.d((Iterable) map.collect(ekcv.a));
                                    return bocfVar;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            bobl boblVar = (bobl) bocaVarA.b().q(bocg.c.a);
                            try {
                                ekgb ekgbVarC = boblVar.c();
                                boblVar.close();
                                if (((ekoe) ekgbVarC).c > 0) {
                                    cxsaVar2.t("Failed: please delete all Penpal conversations and try again.");
                                    return;
                                }
                                String[] strArr = ParticipantsTable.a;
                                bsbg bsbgVar = new bsbg();
                                bsbgVar.b = new bsbt((bsbx) new Function() { // from class: cxoy
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo536andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj) {
                                        bsbx bsbxVar = (bsbx) obj;
                                        bsbxVar.r(((cgsa) ((Optional) cxsaVar2.aE.b()).get()).r());
                                        return bsbxVar;
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                }.apply(new bsbx()));
                                cxsaVar2.t(bsbgVar.d() > 0 ? "Penpal bot is removed." : "No recipient is removed.");
                            } catch (Throwable th) {
                                try {
                                    boblVar.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        }
                    }, cxsaVar.aR));
                }
            }, optional);
        }
        if (((Optional) ((eyig) this.aO).a).isPresent()) {
            SubMenu subMenuAddSubMenu15 = menu.addSubMenu("AppSearch");
            k(subMenuAddSubMenu15, "Restore AppSearch indexes", new cxrw() { // from class: cxet
                @Override // defpackage.cxrw
                public final void a(cyfv cyfvVar) {
                    cxsa cxsaVar = this.a;
                    ((bxtg) ((Optional) ((eyig) cxsaVar.aO).a).get()).b();
                    ((dain) cxsaVar.bd.b()).a("Starting to restore AppSearch indexes.", false);
                }
            }, optional);
            k(subMenuAddSubMenu15, "Remove all indexes", new cxrw() { // from class: cxeu
                @Override // defpackage.cxrw
                public final void a(cyfv cyfvVar) {
                    cxsa cxsaVar = this.a;
                    ((bxtg) ((Optional) ((eyig) cxsaVar.aO).a).get()).a();
                    ((dain) cxsaVar.bd.b()).a("Starting to remove all AppSearch indexes.", false);
                }
            }, optional);
        }
        optional.ifPresent(new Consumer() { // from class: cxev
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                final Activity activity = (Activity) obj;
                final cykk cykkVar = (cykk) this.a.aK.b();
                Menu menu2 = menu;
                menu2.getClass();
                activity.getClass();
                SubMenu subMenuAddSubMenu16 = menu2.addSubMenu("Wear");
                MenuItem menuItemAdd = subMenuAddSubMenu16.add("Report wear sync status");
                menuItemAdd.getClass();
                cykkVar.a(menuItemAdd, activity, new fdap() { // from class: cyjx
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        ((cyfv) obj2).getClass();
                        cykkVar.b(activity);
                        return fctx.a;
                    }
                });
                MenuItem menuItemAdd2 = subMenuAddSubMenu16.add("Force disable wear sync");
                menuItemAdd2.getClass();
                cykkVar.a(menuItemAdd2, activity, new fdap() { // from class: cyjy
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        ((cyfv) obj2).getClass();
                        ekrw ekrwVarF = cykk.a.f();
                        ekrwVarF.X(eksq.a, "BugleWearable");
                        ekrd ekrdVar = (ekrd) ekrwVarF;
                        ekrdVar.X(cqnc.S, "WearableDebugMenuProvider");
                        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/ui/debug/wearable/WearableDebugMenuProvider", "forceDisableWearSync", 116, "WearableDebugMenuProvider.kt")).q("Clearing watch connected data store from debug menu.");
                        cykk cykkVar2 = cykkVar;
                        auvw.k(cykkVar2.l, null, null, new cyke(cykkVar2, activity, null), 3);
                        return fctx.a;
                    }
                });
                MenuItem menuItemAdd3 = subMenuAddSubMenu16.add("Force enable wear sync");
                menuItemAdd3.getClass();
                cykkVar.a(menuItemAdd3, activity, new fdap() { // from class: cyjz
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        ((cyfv) obj2).getClass();
                        final cykk cykkVar2 = cykkVar;
                        final Activity activity2 = activity;
                        final Runnable runnable = new Runnable() { // from class: cyju
                            @Override // java.lang.Runnable
                            public final void run() {
                                cykk cykkVar3 = cykkVar2;
                                auvw.k(cykkVar3.l, null, null, new cykf(cykkVar3, activity2, null), 3);
                            }
                        };
                        if (cykkVar2.h.b()) {
                            ekrw ekrwVarF = cykk.a.f();
                            ekrwVarF.X(eksq.a, "BugleWearable");
                            ekrd ekrdVar = (ekrd) ekrwVarF;
                            ekrdVar.X(cqnc.S, "WearableDebugMenuProvider");
                            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/ui/debug/wearable/WearableDebugMenuProvider", "forceEnableWearSync", 169, "WearableDebugMenuProvider.kt")).q("Marking watch as online from debug menu.");
                            runnable.run();
                        } else {
                            new AlertDialog.Builder(activity2).setTitle("Potential misconfiguration").setMessage("Force enabling wear sync but no WearOS Companion app(s) is installed. Missing Wearable GmsCore modules may result in unexpected sync behavior.\n\nConsider installing \"Google Pixel Watch\" from the Play Store.").setCancelable(true).setPositiveButton("Ack", new eigf(cykkVar2.j, "", "", 0, "WearDebugDialogClick", new DialogInterface.OnClickListener() { // from class: cyjv
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i) {
                                    ekrw ekrwVarF2 = cykk.a.f();
                                    ekrwVarF2.X(eksq.a, "BugleWearable");
                                    ekrd ekrdVar2 = (ekrd) ekrwVarF2;
                                    ekrdVar2.X(cqnc.S, "WearableDebugMenuProvider");
                                    ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/ui/debug/wearable/WearableDebugMenuProvider", "forceEnableWearSync$lambda$8", 156, "WearableDebugMenuProvider.kt")).q("Marking watch as online from debug menu with missing WearOS modules.");
                                    runnable.run();
                                }
                            })).show();
                        }
                        return fctx.a;
                    }
                });
                MenuItem menuItemAdd4 = subMenuAddSubMenu16.add("Queue wear sync");
                menuItemAdd4.getClass();
                cykkVar.a(menuItemAdd4, activity, new fdap() { // from class: cyka
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        ((cyfv) obj2).getClass();
                        cykk cykkVar2 = cykkVar;
                        auvw.k(cykkVar2.l, null, null, new cykj(cykkVar2, null), 3);
                        return fctx.a;
                    }
                });
                MenuItem menuItemAdd5 = subMenuAddSubMenu16.add("Clear DataClient broadcasts");
                menuItemAdd5.getClass();
                cykkVar.a(menuItemAdd5, activity, new fdap() { // from class: cykb
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        ((cyfv) obj2).getClass();
                        cykk cykkVar2 = cykkVar;
                        auvw.k(cykkVar2.l, null, null, new cykd(cykkVar2, null), 3);
                        return fctx.a;
                    }
                });
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        k(menu.addSubMenu("Satellite"), "Connect to Satellite", new cxrw() { // from class: cxew
            @Override // defpackage.cxrw
            public final void a(cyfv cyfvVar) {
                ((clhx) this.a.aN.b()).b(new cxrg());
            }
        }, optional);
    }

    final int e() {
        return ((crny) this.C.b()).f();
    }

    public final cfre g(crof crofVar) {
        return new cfre(((cejp) this.S.b()).d(crofVar.a()));
    }

    public final crof h(int i) {
        if (i < 0) {
            return null;
        }
        return ((crny) this.C.b()).h(i);
    }

    public final eiju i() {
        if (!((asep) this.bl.b()).a()) {
            ((cejj) this.J.b()).d();
        }
        Stream map = Collection.EL.stream(((dggw) this.aH.b()).o()).map(new cxkk()).map(new Function() { // from class: cxns
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String str = (String) obj;
                cxsa cxsaVar = this.a;
                return ((asep) cxsaVar.bl.b()).a() ? ((cejj) cxsaVar.J.b()).b(str).i(new eooz() { // from class: cxol
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        final cejg cejgVar = (cejg) obj2;
                        ekrg ekrgVar = cxsa.c;
                        return cejgVar.o().f().h(new ejvr() { // from class: ceix
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj3) {
                                cejgVar.E();
                                return null;
                            }
                        }, cejgVar.l);
                    }
                }, cxsaVar.ae) : ((cexn) cxsaVar.Q.b()).a(str).f();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = ekgb.d;
        eiju eijuVarA = eijx.j((Iterable) map.collect(ekcv.a)).a(new Callable() { // from class: cxnt
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cxsa cxsaVar = this.a;
                if (!((asep) cxsaVar.bl.b()).a()) {
                    return null;
                }
                ((cejj) cxsaVar.J.b()).d();
                return null;
            }
        }, this.ae);
        cqnx.c(eijuVarA, "Bugle", "Failed to clear tachyon phone registration data");
        return eijuVarA;
    }

    public final void k(Menu menu, String str, cxrw cxrwVar, final Optional optional) {
        List list = this.bv;
        list.add(cxrwVar);
        MenuItem menuItemAdd = menu.add(0, list.size() + 3000, 0, str);
        if (abxb.a() && optional.isPresent()) {
            menuItemAdd.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: cxkb
                @Override // android.view.MenuItem.OnMenuItemClickListener
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    Optional optional2 = optional;
                    int itemId = menuItem.getItemId();
                    Object obj = optional2.get();
                    Optional optionalEmpty = Optional.empty();
                    Optional optionalEmpty2 = Optional.empty();
                    this.a.B(itemId, (Activity) obj, optionalEmpty, optionalEmpty2);
                    return false;
                }
            });
        }
    }

    public final void m(ewfp ewfpVar) {
        ewfn ewfnVar = (ewfn) ewfq.a.createBuilder();
        ewfnVar.copyOnWrite();
        ((ewfq) ewfnVar.instance).b = ewfpVar.a();
        String strValueOf = String.valueOf(String.valueOf(UUID.randomUUID()));
        ewfnVar.copyOnWrite();
        ((ewfq) ewfnVar.instance).c = "debug_".concat(strValueOf);
        ((chwq) this.w.b()).u((ewfq) ewfnVar.build());
    }

    public final void o(Activity activity, String str, CharSequence charSequence, final Runnable runnable, final Runnable runnable2, final String str2) {
        new AlertDialog.Builder(activity).setTitle(a.I(charSequence, "Persist setting as ", "?")).setMessage(str + " will be persisted as " + String.valueOf(charSequence) + " until you manually change it again in the debug menu.").setPositiveButton("Continue", new DialogInterface.OnClickListener() { // from class: cxkx
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                runnable.run();
                String str3 = str2;
                if (str3 != null) {
                    ((dakl) this.a.Y.b()).j(str3);
                }
            }
        }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() { // from class: cxky
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ekrg ekrgVar = cxsa.c;
                Runnable runnable3 = runnable2;
                if (runnable3 != null) {
                    runnable3.run();
                }
            }
        }).show();
    }

    public final void p() {
        q(cqry.p, 1);
        q(cqry.o, 0L);
        q(cqry.n, 0);
        q(cqry.m, 0L);
        q(cqry.q, true);
        fcsu fcsuVar = this.q;
        ((crqv) fcsuVar.b()).h("has_sent_a_message", true);
        ((crqv) fcsuVar.b()).h("has_dismissed_hats", false);
    }

    public final void s(final String str) {
        ecem.e(new Runnable() { // from class: cxlg
            @Override // java.lang.Runnable
            public final void run() {
                ((dain) this.a.bd.b()).a(str, false);
            }
        });
    }

    @Deprecated
    public final void t(final String str) {
        ecem.e(new Runnable() { // from class: cxmk
            @Override // java.lang.Runnable
            public final void run() {
                ((dakl) this.a.Y.b()).j(str);
            }
        });
    }

    public final void v(cyfv cyfvVar, final boolean z, final boolean z2) {
        Activity activity = cyfvVar.a;
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        ScrollView scrollView = new ScrollView(activity);
        LinearLayout linearLayout = new LinearLayout(activity);
        scrollView.addView(linearLayout);
        scrollView.setFillViewport(true);
        linearLayout.setOrientation(1);
        builder.setView(scrollView);
        linearLayout.addView(cyfvVar.b("Create Fake Telephony Message"));
        linearLayout.addView(cyfvVar.c());
        linearLayout.addView(cyfvVar.b("Phone number"));
        final EditText editTextA = cyfvVar.a(1);
        editTextA.setHint("E.g. 5555550000");
        linearLayout.addView(editTextA);
        linearLayout.addView(cyfvVar.b("Message text"));
        final EditText editTextA2 = cyfvVar.a(1);
        editTextA2.setHint("Message text");
        linearLayout.addView(editTextA2);
        builder.setPositiveButton("Create", (DialogInterface.OnClickListener) null);
        builder.setNegativeButton("Close", new DialogInterface.OnClickListener() { // from class: cxnj
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ekrg ekrgVar = cxsa.c;
                dialogInterface.dismiss();
            }
        });
        AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.setOnShowListener(new DialogInterface.OnShowListener() { // from class: cxnl
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                Button button = ((AlertDialog) dialogInterface).getButton(-1);
                final cxsa cxsaVar = this.a;
                final EditText editText = editTextA;
                final EditText editText2 = editTextA2;
                final boolean z3 = z;
                final boolean z4 = z2;
                button.setOnClickListener(new View.OnClickListener() { // from class: cxka
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        boolean z5 = z3;
                        cxsa cxsaVar2 = cxsaVar;
                        EditText editText3 = editText;
                        EditText editText4 = editText2;
                        boolean z6 = z4;
                        try {
                            String string = editText3.getText().toString();
                            String string2 = editText4.getText().toString();
                            ((dakl) cxsaVar2.Y.b()).j("Creating conversation");
                            new cxso((cxsp) cxsaVar2.ag.b(), string, string2, z5, z6).e(new Void[0]);
                        } catch (Exception e) {
                            ((dakl) cxsaVar2.Y.b()).j("Error: ".concat(String.valueOf(e.getMessage())));
                        }
                    }
                });
            }
        });
        alertDialogCreate.show();
    }

    public final void w(Context context, final Consumer consumer) {
        List listM = ((crny) this.C.b()).m();
        if (listM.isEmpty()) {
            ((dakl) this.Y.b()).j("No sims inserted");
            return;
        }
        if (listM.size() == 1) {
            consumer.z((crof) listM.get(0));
            return;
        }
        final ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, listM);
        final ru ruVar = new ru(context);
        ruVar.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        ruVar.setAdapter((SpinnerAdapter) arrayAdapter);
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: cxis
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ArrayAdapter arrayAdapter2 = arrayAdapter;
                ru ruVar2 = ruVar;
                crof crofVar = (crof) arrayAdapter2.getItem(ruVar2.getSelectedItemPosition());
                crofVar.getClass();
                consumer.z(crofVar);
                dain dainVar = (dain) this.a.bd.b();
                crof crofVar2 = (crof) arrayAdapter2.getItem(ruVar2.getSelectedItemPosition());
                crofVar2.getClass();
                dainVar.a("Action triggered for the SIM: ".concat(String.valueOf(String.valueOf(crofVar2.m()))), false);
            }
        });
        builder.setTitle("Select a sim").setView(ruVar).setCancelable(true).create().show();
    }

    public final void x(boolean z, cyfv cyfvVar) {
        final cied ciedVar = (cied) this.bp.b();
        Activity activity = cyfvVar.a;
        if (z) {
            w(activity, new Consumer() { // from class: cxkg
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    String strW = ((crof) obj).w();
                    cied.a.m("Starting the RCS Engine");
                    ciedVar.a(true, strW).k(auvh.b(), this.a.af);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        } else {
            w(activity, new Consumer() { // from class: cxkh
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    String strW = ((crof) obj).w();
                    cied.a.m("Stopping the RCS Engine");
                    ciedVar.a(false, strW).k(auvh.b(), this.a.af);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
    }

    public final void y(crof crofVar, final String str, final cxrz cxrzVar) {
        final int iA = crofVar.a();
        Callable callable = new Callable() { // from class: cxmt
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ((cejp) this.a.S.b()).d(iA);
            }
        };
        eosd eosdVar = this.af;
        eiju eijuVarG = eijx.g(callable, eosdVar);
        eooz eoozVar = new eooz() { // from class: cxmu
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return ((cejj) this.a.J.b()).b((String) obj);
            }
        };
        eoqg eoqgVar = eoqg.a;
        auvh.i(eijuVarG.i(eoozVar, eoqgVar).i(new eooz() { // from class: cxmv
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                ekrg ekrgVar = cxsa.c;
                return ((cejg) obj).s(str);
            }
        }, eosdVar), new Consumer() { // from class: cxmw
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                final Boolean bool = (Boolean) obj;
                ekrg ekrgVar = cxsa.c;
                final cxrz cxrzVar2 = cxrzVar;
                ecem.e(new Runnable() { // from class: cxpf
                    @Override // java.lang.Runnable
                    public final void run() {
                        ekrg ekrgVar2 = cxsa.c;
                        cxrz cxrzVar3 = cxrzVar2;
                        if (bool.booleanValue()) {
                            cxrzVar3.b();
                        } else {
                            cxrzVar3.a();
                        }
                    }
                });
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, eoqgVar);
    }

    public final void z(int i, int i2, int i3, int i4) {
        cqbf cqbfVar = new cqbf();
        for (int i5 = 1; i5 <= i4; i5++) {
            cqbfVar.add(new ConversationIdType(i5));
        }
        new cxrt(this, i, i2, i3, cqbfVar).e(new Void[0]);
    }
}
