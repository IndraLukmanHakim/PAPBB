<?php

use App\Http\Controllers\TransactionController;
use App\Http\Controllers\kategoriController;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\Route;

/*
|--------------------------------------------------------------------------
| API Routes
|--------------------------------------------------------------------------
|
| Here is where you can register API routes for your application. These
| routes are loaded by the RouteServiceProvider within a group which
| is assigned the "api" middleware group. Enjoy building your API!
|
*/

Route::middleware('auth:sanctum')->get('/user', function (Request $request) {
    return $request->user();
});

// //TRANSACTION API 

// Route::get('/transaction', [TransactionController::class, 'index'] );
// Route::get('/transaction/{id}', [TransactionController::class, 'show'] );
// Route::post('/transaction', [TransactionController::class, 'store']);
// Route::put('/transaction/{id}', [TransactionController::class, 'update']);
// Route::delete('transaction/{id}', [TransactionController::class, 'destroy']);


// API FOR TRANSACTION TABLE
Route::resource('/transaction', TransactionController::class)->except(['create', 'edit']);


// // API FOR KATEGORI TABLE
// Route::get('/kategori', [KategoriController::class, 'index']);
// Route::get('/kategori/{id}', [KategoriController::class, 'show']);
// Route::post('/kategori', [KategoriController::class, 'store']);
// Route::put('/kategori/{id}', [kategoriController::class, 'update']);
// Route::delete('/kategori/{id}', [KategoriController::class, 'destroy']);

// API FOR KATEGORI TABLE (ALTERNATIVE)
Route::resource('/kategori', kategoriController::class);